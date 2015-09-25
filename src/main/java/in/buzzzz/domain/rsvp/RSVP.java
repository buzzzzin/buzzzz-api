package in.buzzzz.domain.rsvp;

public class RSVP {

    public enum RSVPStatus {
        YES,
        NO,
        MAY_BE
    }

    private String userId;
    private String buzzId;
    private RSVPStatus status;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
