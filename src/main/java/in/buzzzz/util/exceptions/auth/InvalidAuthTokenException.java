package in.buzzzz.util.exceptions.auth;

import in.buzzzz.util.exceptions.AuthenticationException;
import in.buzzzz.util.messages.ErrorCodes;

/**
 * Created by ekansh on 26/9/15.
 */
public class InvalidAuthTokenException extends AuthenticationException {

    private static final String message = ErrorCodes.AUTH_EXCEPTION;

    public InvalidAuthTokenException(){super(message);}

}
