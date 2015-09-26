package in.buzzzz.v1.service.interest;

import in.buzzzz.domain.interest.Interest;
import in.buzzzz.repository.interest.InterestRepository;
import in.buzzzz.v1.co.interest.InterestCommand;
import in.buzzzz.v1.data.interest.InterestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InterestService {

    @Autowired
    private InterestRepository interestRepository;

    public List<InterestDto> trendingInterests(){

        return null;
    }

    public List<InterestDto> list(InterestCommand interestCommand) {
        List<Interest> interests = interestRepository.findAll();
        List<InterestDto> interestDtos = new ArrayList<InterestDto>();
        for (Interest interest : interests) {
            interestDtos.add(interest.convertToDto());
        }
        return interestDtos;
    }
}
