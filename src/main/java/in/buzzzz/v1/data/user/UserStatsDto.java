package in.buzzzz.v1.data.user;

/**
 * Created by ekansh on 26/9/15.
 */
public class UserStatsDto {

    private Long interestCount;
    private Long buzzCount;

    public Long getInterestCount() {
        return interestCount;
    }

    public void setInterestCount(Long interestCount) {
        this.interestCount = interestCount;
    }

    public Long getBuzzCount() {
        return buzzCount;
    }

    public void setBuzzCount(Long buzzCount) {
        this.buzzCount = buzzCount;
    }
}
