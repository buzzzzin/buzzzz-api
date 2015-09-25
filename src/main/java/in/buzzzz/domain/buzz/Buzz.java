package in.buzzzz.domain.buzz;

import in.buzzzz.v1.co.buzz.BuzzCommand;
import in.buzzzz.v1.data.buzz.BuzzDto;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Buzz {

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

    @Override
    public String toString() {
        return "Buzz{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Buzz(BuzzCommand buzzCommand) {
        this.name = buzzCommand.getName();
        this.imageName = buzzCommand.getImageName();
        this.dateCreated = new Date();
        this.lastUpdated = new Date();
        this.isRSVP = buzzCommand.getIsRSVP();
        this.location = new Location(buzzCommand.getLatitude(), buzzCommand.getLongitude());
        this.schedule = new Schedule();
        this.tags = buzzCommand.getTags();
        this.interests = buzzCommand.getInterests();
        this.email = buzzCommand.getAuthEmail();
    }


    public BuzzDto convertToDto() {
        BuzzDto buzzDto = new BuzzDto();
        buzzDto.setName(this.name);
        buzzDto.setImageName(this.imageName);
        buzzDto.setIsRSVP(this.isRSVP);
        return buzzDto;
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
