package in.buzzzz.v1.co.user;

import in.buzzzz.co.ValidateCommand;
import in.buzzzz.domain.user.User;

/**
 * Created by ekansh on 25/9/15.
 */
public class UserCommand implements ValidateCommand {


    private String id;
    private String name;
    private User.Gendre gendre;
    private String email;
    private String mobile;
    private String country;
    private String password;

    @Override
    public boolean validate() {
        return true;
    }
}
