package in.buzzzz.domain.tag;

import java.util.Date;

public class Tag {

    private Long id;
    private String tag;
    private Long usedCount;
    private Date dateCreated;
    private Date lastUpdated;

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                '}';
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Long usedCount) {
        this.usedCount = usedCount;
    }
}
