package in.buzzzz.domain.tag;

public class BuzzTagMapping {

    private Long id;
    private Long buzzId;
    private String buzzName;
    private String tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuzzId() {
        return buzzId;
    }

    public void setBuzzId(Long buzzId) {
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
}
