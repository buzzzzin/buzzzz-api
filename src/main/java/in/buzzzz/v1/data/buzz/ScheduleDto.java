package in.buzzzz.v1.data.buzz;

import in.buzzzz.data.buzz.BuzzData;
import in.buzzzz.domain.buzz.Schedule;

public class ScheduleDto implements BuzzData {
    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private Schedule.Period period;

    public ScheduleDto() {
    }

    public ScheduleDto(Schedule schedule) {
        this.startDate = schedule.getStartDate() != null ? schedule.getStartDate().toString() : "";
        this.endDate = schedule.getEndDate() != null ? schedule.getEndDate().toString() : "";
        this.startTime = schedule.getStartTime() != null ? schedule.getStartTime().toString() : "";
        this.endTime = schedule.getEndTime() != null ? schedule.getEndTime().toString() : "";
        this.period = schedule.getPeriod();
    }

    public Schedule.Period getPeriod() {
        return period;
    }

    public void setPeriod(Schedule.Period period) {
        this.period = period;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
