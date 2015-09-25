package in.buzzzz.v1.data.user;

import in.buzzzz.data.user.UserData;
import in.buzzzz.domain.user.User;

/**
 * Created by ekansh on 25/9/15.
 */
public class UserInfoDto implements UserData {

    private String id;
    private String name;
    private User.Gendre gendre;
    private String email;
    private String mobile;
    private String country;


}
