package in.buzzzz.v1.co.buzz;

import in.buzzzz.co.AuthenticationCommand;
import in.buzzzz.co.ValidateCommand;
import in.buzzzz.domain.buzz.Schedule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BuzzCommand extends AuthenticationCommand implements ValidateCommand, Serializable {

    static final long serialVersionUID = -1L;

    private String name;
    private String imageName;
    private Boolean isRSVP;
    private Double latitude;
    private Double longitude;
    private String address;
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
        if (this.latitude == null) {
            result = false;
        }
        if (this.longitude == null) {
            result = false;
        }
        if (this.getAuthEmail() == null) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
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
        return tags==null?new ArrayList<String>():tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getInterests() {
        return interests==null?new ArrayList<String>():interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
