package in.buzzzz.domain.mapping;

import org.springframework.data.annotation.Id;

public class UserAuthMapping {

    @Id
    private String email;
    private String authToken;

    @Override
    public String toString() {
        return "UserAuthMapping{" +
                "email='" + email + '\'' +
                ", authToken='" + authToken + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
