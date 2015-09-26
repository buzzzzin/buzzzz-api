package in.buzzzz.v1.co.interest;

import in.buzzzz.co.AuthenticationCommand;
import in.buzzzz.co.ValidateCommand;

public class InterestCommand extends AuthenticationCommand implements ValidateCommand {

    private String interestId;

    public String getInterestId() {
        return interestId;
    }

    public void setInterestId(String interestId) {
        this.interestId = interestId;
    }

    @Override
    public boolean validate() {
        return !(interestId == null || interestId.equals(""));
    }
}
