package in.buzzzz.util.mq;

import java.io.Serializable;
import java.util.List;

public class InterestBuzzMappingDto implements Serializable {
    static final long serialVersionUID = -1L;

    private String buzzId;
    private String buzzName;
    private List<String> interests;

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
