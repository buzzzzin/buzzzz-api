package in.buzzzz.domain.mapping;

import in.buzzzz.domain.buzz.Buzz;
import in.buzzzz.util.mq.TagBuzzMappingDto;
import in.buzzzz.v1.data.buzz.BuzzDto;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class TagBuzzMapping {

    @Id
    private String id;
    private String buzzId;
    private String buzzName;
    private String tag;
    private Date dateCreated;
    private Date lastUpdated;

    public TagBuzzMapping() {
    }

    public TagBuzzMapping(BuzzDto buzzDto) {
    }

    public static TagBuzzMappingDto populateTagBuzzMappingDto(Buzz buzz) {
        TagBuzzMappingDto tagBuzzMappingDto = new TagBuzzMappingDto();
        tagBuzzMappingDto.setBuzzId(buzz.getId());
        tagBuzzMappingDto.setBuzzName(buzz.getName());
        tagBuzzMappingDto.setTags(buzz.getTags());
        return tagBuzzMappingDto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuzzId() {
        return buzzId;
    }

    public void setBuzzId(String buzzId) {
        this.buzzId = buzzId;
    }

    public String getBuzzName() {
        return buzzName;
    }

    public void setBuzzName(String buzzName) {
        this.buzzName = buzzName;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
