package in.buzzzz.domain.rsvp;

import in.buzzzz.data.rsvp.RSVPData;
import in.buzzzz.v1.co.rsvp.RSVPCommand;
import org.springframework.data.annotation.Id;

public class RSVP {

    public enum RSVPStatus {
        YES,
        NO,
        MAY_BE
    }

    @Id
    private String id;
    private String email;
    private String buzzId;
    private RSVPStatus status;

    public RSVP() {
    }

    public RSVP(RSVPCommand rsvpCommand) {
        this.email = rsvpCommand.getAuthEmail();
        this.buzzId = rsvpCommand.getBuzzId();
        this.status = rsvpCommand.getStatus();
    }

    public RSVPData convertToDto() {
        return null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBuzzId() {
        return buzzId;
    }

    public void setBuzzId(String buzzId) {
        this.buzzId = buzzId;
    }

    public RSVPStatus getStatus() {
        return status;
    }

    public void setStatus(RSVPStatus status) {
        this.status = status;
    }
}
