package in.buzzzz.domain.buzz;

import java.util.Date;

public class Schedule {

    public enum Period {
        ONCE,
        DAILY,
        MONTHLY,
        WEEKLY,
        CUSTOM
    }

    private Date startDate;
    private Date endDate;
    private Date startTime;
    private Date endTime;
    private Period period;

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
