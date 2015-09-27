package in.buzzzz.v1.service.interest;

import in.buzzzz.domain.mapping.InterestBuzzMapping;
import in.buzzzz.repository.mapping.InterestBuzzMappingRepository;
import in.buzzzz.util.mq.InterestBuzzMappingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterestBuzzMappingService {

    @Autowired
    private InterestBuzzMappingRepository interestBuzzMappingRepository;

    public void createInterestBuggMapping(InterestBuzzMappingDto dto) {
        try {
            for (String interest : dto.getInterests()) {
                save(interest, dto.getBuzzId(), dto.getBuzzName());
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public void save(String interest, String buzzId, String buzzName) {
        InterestBuzzMapping interestBuzzMapping = new InterestBuzzMapping(interest, buzzId, buzzName);
        interestBuzzMappingRepository.save(interestBuzzMapping);
    }


}
