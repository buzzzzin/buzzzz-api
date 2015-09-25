package in.buzzzz.v1.co.user;

import in.buzzzz.co.ValidateCommand;
import in.buzzzz.domain.user.User;

/**
 * Created by ekansh on 25/9/15.
 */
public class UserCommand implements ValidateCommand {


    private String id;
    private String name;
    private User.Gender gender;
    private String email;
    private String mobile;
    private String country;
    private String password;

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
}
