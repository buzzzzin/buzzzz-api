package in.buzzzz.domain.buzz;

public class BuzzStats {

    private Long goingCount;
    private Long notComingCount;
    private Long mayBeCount;
    private Long viewCount;
    private transient Long responseCount;

    public Long getGoingCount() {
        return goingCount;
    }

    public void setGoingCount(Long goingCount) {
        this.goingCount = goingCount;
    }

    public Long getNotComingCount() {
        return notComingCount;
    }

    public void setNotComingCount(Long notComingCount) {
        this.notComingCount = notComingCount;
    }

    public Long getMayBeCount() {
        return mayBeCount;
    }

    public void setMayBeCount(Long mayBeCount) {
        this.mayBeCount = mayBeCount;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public Long getResponseCount() {
        return goingCount + notComingCount + mayBeCount;
    }

    public void setResponseCount(Long responseCount) {
        this.responseCount = responseCount;
    }
}
