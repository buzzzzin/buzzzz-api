package in.buzzzz.domain.user;

import org.springframework.data.annotation.Id;

/**
 * Created by ekansh on 25/9/15.
 */

public class User {

    public enum Gendre {
        MALE,
        FEMALE
    }

    @Id
    private String id;
    private String name;
    private Gendre gendre;
    private String email;
    private String mobile;
    private String country;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gendre=" + gendre +
                '}';
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

    public Gendre getGendre() {
        return gendre;
    }

    public void setGendre(Gendre gendre) {
        this.gendre = gendre;
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
