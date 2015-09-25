package in.buzzzz.v1.co.rsvp;

import in.buzzzz.co.AuthenticationCommand;
import in.buzzzz.co.ValidateCommand;
import in.buzzzz.domain.rsvp.RSVP;

public class RSVPCommand extends AuthenticationCommand implements ValidateCommand {

    private String buzzId;
    private RSVP.RSVPStatus status;

    public String getBuzzId() {
        return buzzId;
    }

    public void setBuzzId(String buzzId) {
        this.buzzId = buzzId;
    }

    public RSVP.RSVPStatus getStatus() {
        return status;
    }

    public void setStatus(RSVP.RSVPStatus status) {
        this.status = status;
    }

    @Override
    public boolean validate() {
        Boolean result = true;
        if (this.buzzId == null || this.buzzId.equals("")) {
            result = false;
        }
        if (this.status == null) {
            result = false;
        }
        if (this.getAuthEmail() == null) {
            result = false;
        }
        return result;
    }
}
