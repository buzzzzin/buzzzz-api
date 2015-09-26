package in.buzzzz.domain.buzz;

import in.buzzzz.v1.co.buzz.BuzzCommand;
import in.buzzzz.v1.data.buzz.BuzzDto;
import in.buzzzz.v1.data.buzz.BuzzStatsDto;
import in.buzzzz.v1.data.buzz.LocationDto;
import in.buzzzz.v1.data.buzz.ScheduleDto;
import org.springframework.data.annotation.Id;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Buzz {

    public enum Status {
        SCHEDULED,
        NOW,
        END
    }

    @Id
    private String id;
    private String name;
    private String imageName;
    private Date dateCreated;
    private Date lastUpdated;
    private Boolean isRSVP;
    private BuzzStats stats;
    private Location location;
    private Schedule schedule;
    private List<String> tags;
    private List<String> interests;
    private String email;
    private Status activeStatus;

    @Override
    public String toString() {
        return "Buzz{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Buzz() {
    }

    public static List<BuzzDto> convertToDto(List<Buzz> buzzs) {
        List<BuzzDto> buzzDtos = new LinkedList<BuzzDto>();
        for (Buzz buzz : buzzs)
            buzzDtos.add(buzz.convertToDto());
        return buzzDtos;
    }


    public Buzz(BuzzCommand buzzCommand) throws ParseException {
        this.name = buzzCommand.getName();
        this.imageName = buzzCommand.getImageName();
        this.dateCreated = new Date();
        this.lastUpdated = new Date();
        this.isRSVP = buzzCommand.getIsRSVP();
        this.location = new Location(buzzCommand.getLatitude(), buzzCommand.getLongitude(), buzzCommand.getAddress());
        this.schedule = new Schedule(buzzCommand.getStartTime(), buzzCommand.getEndTime(), buzzCommand.getPeriod());
        this.tags = buzzCommand.getTags();
        this.interests = buzzCommand.getInterests();
        this.email = buzzCommand.getAuthEmail();
        this.activeStatus = Status.SCHEDULED;
    }


    public BuzzDto convertToDto() {
        BuzzDto buzzDto = new BuzzDto();
        buzzDto.setBuzzId(this.id);
        buzzDto.setName(this.name);
        buzzDto.setImageName(this.imageName);
        buzzDto.setIsRSVP(this.isRSVP);
        buzzDto.setInterests(this.interests);
        buzzDto.setLocation(new LocationDto(this.location));
        buzzDto.setSchedule(new ScheduleDto(this.schedule));
        buzzDto.setStats(new BuzzStatsDto(this.stats));
        buzzDto.setEmail(this.email);
        return buzzDto;
    }

    public Status getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Status activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public BuzzStats getStats() {
        return stats;
    }

    public void setStats(BuzzStats stats) {
        this.stats = stats;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
