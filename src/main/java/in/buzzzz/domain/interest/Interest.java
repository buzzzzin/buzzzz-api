package in.buzzzz.domain.interest;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Interest {

    @Id
    private String id;
    private String name;
    private Date dateCreated;

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
