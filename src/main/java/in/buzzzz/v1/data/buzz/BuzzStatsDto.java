package in.buzzzz.v1.data.buzz;

import in.buzzzz.domain.buzz.BuzzStats;

public class BuzzStatsDto {
    private Long goingCount;
    private Long notComingCount;
    private Long mayBeCount;
    private Long viewCount;
    private Long responseCount;

    public BuzzStatsDto() {
    }

    public BuzzStatsDto(BuzzStats stats) {
        if (stats != null) {
            this.goingCount = stats.getGoingCount() == null ? 0 : stats.getGoingCount();
            this.notComingCount = stats.getNotComingCount() == null ? 0 : stats.getNotComingCount();
            this.mayBeCount = stats.getMayBeCount() == null ? 0 : stats.getMayBeCount();
            this.responseCount = stats.getResponseCount() == null?0: stats.getResponseCount();
            this.viewCount = stats.getViewCount() ==null?0:stats.getViewCount();

        } else {
            this.goingCount = 0l;
            this.notComingCount = 0l;
            this.mayBeCount = 0l;
            this.responseCount = 0l;
            this.viewCount = 0l;
        }
    }

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
        return responseCount;
    }

    public void setResponseCount(Long responseCount) {
        this.responseCount = responseCount;
    }
}
