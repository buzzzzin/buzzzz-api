package in.buzzzz.util.exceptions.interest;

import in.buzzzz.util.exceptions.BuzzException;
import in.buzzzz.util.messages.ErrorCodes;

public class InterestNotFoundException extends BuzzException {

    private static final String message = ErrorCodes.INTEREST_NOT_FOUND;

    public InterestNotFoundException() {
        super(message);
    }
}
