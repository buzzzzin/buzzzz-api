package in.buzzzz.v1.data.buzz;

import in.buzzzz.data.buzz.BuzzData;

public class BuzzDto implements BuzzData {

    private String buzzId;
    private String name;
    private String imageName;
    private Boolean isRSVP;

    public String getBuzzId() {
        return buzzId;
    }

    public void setBuzzId(String buzzId) {
        this.buzzId = buzzId;
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
}
