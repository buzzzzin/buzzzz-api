package in.buzzzz.v1.data.login;

import in.buzzzz.v1.data.user.UserInfoDto;

/**
 * Created by ekansh on 25/9/15.
 */
public class LoginDto {

    private UserInfoDto user;
    private boolean hasInterests;

    public UserInfoDto getUser() {
        return user;
    }

    public void setUser(UserInfoDto user) {
        this.user = user;
    }

    public boolean isHasInterests() {
        return hasInterests;
    }

    public void setHasInterests(boolean hasInterests) {
        this.hasInterests = hasInterests;
    }
}
