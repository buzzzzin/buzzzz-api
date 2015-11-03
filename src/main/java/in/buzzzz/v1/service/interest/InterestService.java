package in.buzzzz.v1.service.interest;

import in.buzzzz.domain.interest.Interest;
import in.buzzzz.domain.user.User;
import in.buzzzz.repository.interest.InterestRepository;
import in.buzzzz.repository.user.UserRepository;
import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.util.exceptions.interest.InterestNotFoundException;
import in.buzzzz.v1.co.interest.InterestCommand;
import in.buzzzz.v1.data.interest.InterestDataDto;
import in.buzzzz.v1.data.interest.InterestDto;
import in.buzzzz.v1.service.auth.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InterestService {

    @Autowired
    private InterestRepository interestRepository;
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private UserRepository userRepository;

    public List<InterestDto> trendingInterests() {
        Pageable pageable = new PageRequest(0, 25, null);
        return Interest.convertToDto(interestRepository.findAllByTrending(true, pageable));
    }

    public InterestDataDto list() {
        List<Interest> interests = interestRepository.findAll();
        List<InterestDto> interestDtos = new ArrayList<InterestDto>();
        for (Interest interest : interests) {
            interestDtos.add(interest.convertToDto());
        }
        return new InterestDataDto(interestDtos);
    }

    public List<InterestDto> subscribe(InterestCommand interestCommand, String authToken) throws GenericException {
        String email = authenticationService.authenticateToken(authToken);
        interestCommand.setAuthEmail(email);
        Interest interest = interestRepository.findById(interestCommand.getInterestId());
        if (interest == null) {
            throw new InterestNotFoundException();
        }
        assignInterestToUser(email, interest);
        return null;
    }

    private void assignInterestToUser(String email, Interest interest) {
        User user = userRepository.findByEmail(email);
        InterestDto interestDto = new InterestDto();
        interestDto.setName(interest.getName());
        interestDto.setImage(interest.getImage());
        interestDto.setId(interest.getId());
        if (!user.getInterests().contains(interestDto)) {
            List<InterestDto> interestDtos = user.getInterests();
            interestDtos.add(interestDto);
            user.setInterests(interestDtos);
            userRepository.save(user);
        }
    }

    public void increaseInterestCount(List<String> interests) {
        try {
            for (String interest : interests) {
                Interest interestInstance = interestRepository.findByName(interest);
                if (interestInstance != null) {
                    interestInstance.setUsedCount(interestInstance.getUsedCount() + 1);
                    interestRepository.save(interestInstance);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
