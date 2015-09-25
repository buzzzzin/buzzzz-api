package in.buzzzz.v1.data.user;

/**
 * Created by ekansh on 26/9/15.
 */
public class UserProfileDto {

    private UserInfoDto user;
    private UserStatsDto stats;

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
}
