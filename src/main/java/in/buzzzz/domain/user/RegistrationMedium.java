package in.buzzzz.domain.user;

/**
 * Created by ekansh on 25/9/15.
 */
public class RegistrationMedium {

    public enum Medium {
        FACEBOOK,
        GPLUS,
        MANUAL
    }
    private String mediumId;
    private Medium mediumType;

    public RegistrationMedium(){}
    public RegistrationMedium(String mediumId, Medium mediumType){
        this.mediumId =mediumId;
        this.mediumType=mediumType;
    }

    public String getMediumId() {
        return mediumId;
    }

    public void setMediumId(String mediumId) {
        this.mediumId = mediumId;
    }

    public Medium getMediumType() {
        return mediumType;
    }

    public void setMediumType(Medium mediumType) {
        this.mediumType = mediumType;
    }
}
