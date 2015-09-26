package in.buzzzz.v1.service.interest;

import in.buzzzz.domain.interest.Interest;
import in.buzzzz.repository.interest.InterestRepository;
import in.buzzzz.v1.co.interest.InterestCommand;
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

    public List<InterestDto> trendingInterests(){
        Pageable pageable = new PageRequest(0,25,null);
        return Interest.convertToDto(interestRepository.findAllByTrending(true,pageable));
    }

    public List<InterestDto> list() {
        List<Interest> interests = interestRepository.findAll();
        List<InterestDto> interestDtos = new ArrayList<InterestDto>();
        for (Interest interest : interests) {
            interestDtos.add(interest.convertToDto());
        }
        return interestDtos;
    }

    public List<InterestDto> subscribe(InterestCommand interest,String authToken) {
        String email = authenticationService.authenticateToken(authToken);
        interest.setAuthEmail(email);
        List<Interest> interests = interestRepository.findAll();
        return null;
    }
}
