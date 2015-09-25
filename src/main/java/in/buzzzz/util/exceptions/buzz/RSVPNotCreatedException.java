package in.buzzzz.util.exceptions.buzz;

import in.buzzzz.util.exceptions.BuzzException;
import in.buzzzz.util.messages.ErrorCodes;

public class RSVPNotCreatedException extends BuzzException {

    private static final String message = ErrorCodes.RSVP_NOT_CEATED;

    public RSVPNotCreatedException() {
        super(message);
    }
}
