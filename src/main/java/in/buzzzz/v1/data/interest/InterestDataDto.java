package in.buzzzz.v1.data.interest;

import java.util.List;

public class InterestDataDto {

    private List<InterestDto> interests;

    public InterestDataDto() {
    }

    public InterestDataDto(List<InterestDto> interestDtos) {
        this.interests = interestDtos;
    }

    public List<InterestDto> getInterests() {
        return interests;
    }

    public void setInterests(List<InterestDto> interests) {
        this.interests = interests;
    }
}
