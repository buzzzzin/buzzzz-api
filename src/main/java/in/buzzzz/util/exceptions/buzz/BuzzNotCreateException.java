package in.buzzzz.util.exceptions.buzz;

import in.buzzzz.util.exceptions.BuzzException;
import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.util.messages.ErrorCodes;

public class BuzzNotCreateException extends BuzzException {

    private static final String message = ErrorCodes.BUZZ_NOT_CREATE;

    public BuzzNotCreateException() {
        super(message);
    }
}
