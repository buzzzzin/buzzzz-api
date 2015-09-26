package in.buzzzz.v1.data.buzz;

import in.buzzzz.data.buzz.BuzzData;

import java.util.List;

public class BuzzDto implements BuzzData {

    private String buzzId;
    private String name;
    private String imageName;
    private Boolean isRSVP;
    private List<String> interests;
    private LocationDto location;
    private ScheduleDto schedule;
    private BuzzStatsDto stats;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BuzzStatsDto getStats() {
        return stats;
    }

    public void setStats(BuzzStatsDto stats) {
        this.stats = stats;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }

    public ScheduleDto getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleDto schedule) {
        this.schedule = schedule;
    }

    public String getBuzzId() {
        return buzzId;
    }

    public void setBuzzId(String buzzId) {
        this.buzzId = buzzId;
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
}
