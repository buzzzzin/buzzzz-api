package in.buzzzz.v1.data.user;

import in.buzzzz.v1.data.buzz.BuzzDto;
import in.buzzzz.v1.data.interest.InterestDto;

import java.util.List;

/**
 * Created by ekansh on 26/9/15.
 */
public class UserProfileDto {

    private UserInfoDto user;
    private UserStatsDto stats;
    private List<InterestDto> interests;
    private List<BuzzDto> buzzs;

    public UserInfoDto getUser() {
        return user;
    }

    public void setUser(UserInfoDto user) {
        this.user = user;
    }

    public UserStatsDto getStats() {
        return stats;
    }

    public void setStats(UserStatsDto stats) {
        this.stats = stats;
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
