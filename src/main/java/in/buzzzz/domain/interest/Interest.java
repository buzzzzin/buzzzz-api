package in.buzzzz.domain.interest;

import in.buzzzz.data.interest.InterestData;
import in.buzzzz.v1.data.interest.InterestDto;
import in.buzzzz.v1.data.interest.InterestDto;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Interest {

    @Id
    private String id;
    private String name;
    private Date dateCreated;

    @Override
    public String toString() {
        return "Interest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public InterestData convertToDto(){
        InterestDto interestDto = new InterestDto();
        interestDto.setId(this.id);
        interestDto.setName(this.name);
        return interestDto;
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
}
