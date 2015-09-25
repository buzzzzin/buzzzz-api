package in.buzzzz.domain.tag;

import java.util.Date;

public class Tag {

    private String id;
    private String tag;
    private Long usedCount;
    private Date dateCreated;
    private Date lastUpdated;

    @Override
    public String toString() {
        return "Tag{" +
                "id='" + id + '\'' +
                ", tag='" + tag + '\'' +
                ", usedCount=" + usedCount +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Long usedCount) {
        this.usedCount = usedCount;
    }
}
