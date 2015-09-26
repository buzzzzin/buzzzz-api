package in.buzzzz.v1.data.interest;

import in.buzzzz.data.interest.InterestData;

public class InterestDto implements InterestData {
    private String id;
    private String name;
    private String image;
    private Boolean isSubscribed;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
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
}
