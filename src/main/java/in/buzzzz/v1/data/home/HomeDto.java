package in.buzzzz.v1.data.home;

import in.buzzzz.v1.data.buzz.BuzzDto;
import in.buzzzz.v1.data.interest.InterestDto;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ekansh on 26/9/15.
 */
public class HomeDto {

    private List<InterestDto> interests;
    private List<BuzzDto> buzzs;

    public HomeDto(){
        this.interests = new LinkedList<InterestDto>();
        this.buzzs = new LinkedList<BuzzDto>();
    }

    public List<InterestDto> getInterests() {
        return interests;
    }

    public void setInterests(List<InterestDto> interests) {
        this.interests = interests;
    }

    public List<BuzzDto> getBuzzs() {
        return buzzs;
    }

    public void setBuzzs(List<BuzzDto> buzzs) {
        this.buzzs = buzzs;
    }
}
