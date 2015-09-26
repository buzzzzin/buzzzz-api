package in.buzzzz.v1.service.interest;

import in.buzzzz.domain.interest.Interest;
import in.buzzzz.domain.user.User;
import in.buzzzz.repository.interest.InterestRepository;
import in.buzzzz.repository.user.UserRepository;
import in.buzzzz.util.exceptions.interest.InterestNotFoundException;
import in.buzzzz.v1.co.interest.InterestCommand;
import in.buzzzz.v1.data.interest.InterestDto;
import in.buzzzz.v1.service.auth.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return Interest.convertToDto(interestRepository.findAllByTrending(true));
    }

    public List<InterestDto> list() {
        List<Interest> interests = interestRepository.findAll();
        List<InterestDto> interestDtos = new ArrayList<InterestDto>();
        for (Interest interest : interests) {
            interestDtos.add(interest.convertToDto());
        }
        return interestDtos;
    }

    public List<InterestDto> subscribe(InterestCommand interestCommand, String authToken) {
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
        List<InterestDto> interestDtos = new ArrayList<InterestDto>();
        interestDto.setName(interest.getName());
        interestDto.setImage(interest.getImage());
        interestDto.setId(interest.getId());
        interestDtos.add(interestDto);
        user.setInterests(interestDtos);
        userRepository.save(user);
    }
}
