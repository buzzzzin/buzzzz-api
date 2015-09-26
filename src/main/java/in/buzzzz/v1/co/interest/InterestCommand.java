package in.buzzzz.v1.co.interest;

import in.buzzzz.co.AuthenticationCommand;
import in.buzzzz.co.ValidateCommand;

public class InterestCommand extends AuthenticationCommand implements ValidateCommand {

    private String interestId;

    @Override
    public boolean validate() {
        return !(interestId == null || interestId.equals(""));
    }
}
