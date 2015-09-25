package in.buzzzz.domain.user;

import in.buzzzz.data.interest.InterestData;
import in.buzzzz.v1.co.user.UserCommand;
import in.buzzzz.v1.data.user.UserInfoDto;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

/**
 * Created by ekansh on 25/9/15.
 */

public class User {

    public enum Gender {
        MALE,
        FEMALE
    }

    @Id
    private String id;
    private Date dateCreated = new Date();
    private Date lastUpdated = new Date();
    private String name;
    private String image;
    private Gender gender;
    private String email;
    private String mobile;
    private String country;
    private String password;
    private RegistrationMedium medium;
    private List<InterestData> interests;

    public User(){}
    public User(UserCommand userCommand){
        this.id= userCommand.getId();
        this.name = userCommand.getName();
        this.image = userCommand.getImage();
        this.gender = userCommand.getGender();
        this.email = userCommand.getEmail();
        this.mobile = userCommand.getMobile();
        this.country = userCommand.getCountry();
        this.medium = userCommand.getMedium();
        this.interests = userCommand.getInterests();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gendre=" + gender +
                '}';
    }

    public UserInfoDto convertToDto() {
        UserInfoDto infoDto = new UserInfoDto();
        infoDto.setId(this.id);
        infoDto.setName(this.name);
        infoDto.setGender(this.gender);
        infoDto.setEmail(this.name);
        infoDto.setMobile(this.name);
        infoDto.setCountry(this.name);
        infoDto.setMedium(this.medium);
        return infoDto;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
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

    public RegistrationMedium getMedium() {
        return medium;
    }

    public void setMedium(RegistrationMedium medium) {
        this.medium = medium;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<InterestData> getInterests() {
        return interests;
    }

    public void setInterests(List<InterestData> interests) {
        this.interests = interests;
    }


}
