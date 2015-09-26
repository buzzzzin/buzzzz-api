package in.buzzzz.domain.interest;

import in.buzzzz.v1.data.interest.InterestDto;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Interest {

    @Id
    private String id;
    private String name;
    private Date dateCreated;
    private String image;
    private Boolean trending;
    private Long usedCount;

    @Override
    public String toString() {
        return "Interest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }


    public InterestDto convertToDto() {
        InterestDto interestDto = new InterestDto();
        interestDto.setId(this.id);
        interestDto.setName(this.name);
        interestDto.setImage(this.image);
        interestDto.setIsSubscribed(false);
        return interestDto;
    }

    public Boolean getTrending() {
        return trending;
    }

    public void setTrending(Boolean trending) {
        this.trending = trending;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Long getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Long usedCount) {
        this.usedCount = usedCount;
    }
}
