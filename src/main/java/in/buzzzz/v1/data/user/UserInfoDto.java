package in.buzzzz.v1.data.user;

import in.buzzzz.data.user.UserData;
import in.buzzzz.domain.user.RegistrationMedium;
import in.buzzzz.domain.user.User;

/**
 * Created by ekansh on 25/9/15.
 */
public class UserInfoDto implements UserData {

    private String id;
    private String name;
    private User.Gender gender;
    private String email;
    private String mobile;
    private String country;
    private RegistrationMedium medium;

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

    public RegistrationMedium getMedium() {
        return medium;
    }

    public void setMedium(RegistrationMedium medium) {
        this.medium = medium;
    }
}
