package in.buzzzz.domain.buzz;

public class BuzzStats {

    private Long goingCount =0l;
    private Long notComingCount =0l;
    private Long mayBeCount =0l;
    private Long viewCount =0l;
    private transient Long responseCount =0l;

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
