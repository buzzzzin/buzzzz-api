package in.buzzzz.domain.mapping;

import in.buzzzz.domain.buzz.Buzz;
import in.buzzzz.util.mq.InterestBuzzMappingDto;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class InterestBuzzMapping {

    @Id
    private String id;
    private String interestName;
    private String buzzId;
    private String buzzName;

    public InterestBuzzMapping() {
    }

    public InterestBuzzMapping(String interestName,String buzzId,String buzzName) {
        this.interestName = interestName;
        this.buzzName = buzzName;
        this.buzzId = buzzId;
    }

    public String getInterestName() {
        return interestName;
    }

    public void setInterestName(String interestName) {
        this.interestName = interestName;
    }

    public String getBuzzId() {
        return buzzId;
    }

    public void setBuzzId(String buzzId) {
        this.buzzId = buzzId;
    }

    public String getBuzzName() {
        return buzzName;
    }

    public void setBuzzName(String buzzName) {
        this.buzzName = buzzName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static InterestBuzzMappingDto populateInterestMappingDto(Buzz buzz) {
        InterestBuzzMappingDto interestBuzzMappingDto = new InterestBuzzMappingDto();
        interestBuzzMappingDto.setInterests(buzz.getInterests()==null?new ArrayList<String>():buzz.getInterests());
        interestBuzzMappingDto.setBuzzName(buzz.getName());
        interestBuzzMappingDto.setBuzzId(buzz.getId());
        return interestBuzzMappingDto;
    }
}
