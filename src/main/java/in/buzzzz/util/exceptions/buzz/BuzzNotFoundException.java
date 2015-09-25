package in.buzzzz.util.exceptions.buzz;

import in.buzzzz.util.exceptions.BuzzException;
import in.buzzzz.util.messages.ErrorCodes;

public class BuzzNotFoundException extends BuzzException {

    private static final String message = ErrorCodes.BUZZ_NOT_FOUND;

    public BuzzNotFoundException() {
        super(message);
    }
}
