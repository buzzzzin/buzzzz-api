package in.buzzzz.v1.co.buzz;

import in.buzzzz.co.AuthenticationCommand;
import in.buzzzz.co.ValidateCommand;
import in.buzzzz.domain.buzz.Schedule;

import java.io.Serializable;
import java.util.List;

public class BuzzCommand extends AuthenticationCommand implements ValidateCommand, Serializable {

    static final long serialVersionUID = -1L;

    private String name;
    private String imageName;
    private Boolean isRSVP;
    private String latitude;
    private String longitude;
    private String startTime;
    private String endTime;
    private Schedule.Period period;
    private List<String> tags;
    private List<String> interests;

    @Override
    public boolean validate() {
        Boolean result = true;
        if (this.name == null || this.name.equals("")) {
            result = false;
        }
        if (this.startTime == null || this.startTime.equals("")) {
            result = false;
        }
        if (this.period == null) {
            result = false;
        }
        if (this.latitude == null || this.latitude.equals("")) {
            result = false;
        }
        if (this.longitude == null || this.longitude.equals("")) {
            result = false;
        }
        return result;
    }

    @Override
    public String toString() {
        return "BuzzCommand{" +
                "name='" + name + '\'' +
                ", startTime='" + startTime + '\'' +
                ", period=" + period +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Boolean getIsRSVP() {
        return isRSVP;
    }

    public void setIsRSVP(Boolean isRSVP) {
        this.isRSVP = isRSVP;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
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

    public Schedule.Period getPeriod() {
        return period;
    }

    public void setPeriod(Schedule.Period period) {
        this.period = period;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
