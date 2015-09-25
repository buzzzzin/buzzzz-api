package in.buzzzz.v1.co.user;

import in.buzzzz.co.ValidateCommand;
import in.buzzzz.data.interest.InterestData;
import in.buzzzz.domain.user.RegistrationMedium;
import in.buzzzz.domain.user.User;

import java.util.List;

/**
 * Created by ekansh on 25/9/15.
 */
public class UserCommand implements ValidateCommand {


    private String id;
    private String name;
    private User.Gender gender;
    private String image;
    private String email;
    private String mobile;
    private String country;
    private String password;
    private String mediumId;
    private RegistrationMedium.Medium mediumType;
    private List<InterestData> interests;

    @Override
    public String toString() {
        return "UserCommand{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", country='" + country + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean validate() {
        return true;
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

    public User.Gender getGender() {
        return gender;
    }

    public void setGender(User.Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMediumId() {
        return mediumId;
    }

    public void setMediumId(String mediumId) {
        this.mediumId = mediumId;
    }

    public RegistrationMedium.Medium getMediumType() {
        return mediumType;
    }

    public void setMediumType(RegistrationMedium.Medium mediumType) {
        this.mediumType = mediumType;
    }

    public List<InterestData> getInterests() {
        return interests;
    }

    public void setInterests(List<InterestData> interests) {
        this.interests = interests;
    }
}
