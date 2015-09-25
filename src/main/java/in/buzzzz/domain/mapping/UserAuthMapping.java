package in.buzzzz.domain.mapping;

/**
 * Created by ekansh on 26/9/15.
 */
public class UserAuthMapping {

    private String email;
    private String authToken;

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
