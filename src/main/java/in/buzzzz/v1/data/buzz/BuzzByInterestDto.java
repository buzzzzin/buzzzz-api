package in.buzzzz.v1.data.buzz;

import java.util.List;

public class BuzzByInterestDto {

    private List<BuzzDto> buzzs;

    public BuzzByInterestDto() {
    }

    public BuzzByInterestDto(List<BuzzDto> buzzDtos) {
        this.buzzs = buzzDtos;
    }

    public List<BuzzDto> getBuzzs() {
        return buzzs;
    }

    public void setBuzzs(List<BuzzDto> buzzs) {
        this.buzzs = buzzs;
    }
}
