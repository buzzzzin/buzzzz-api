package in.buzzzz.util.exceptions;

import in.buzzzz.util.messages.ErrorCodes;

/**
 * Created by ekansh on 24/9/15.
 */
public class AuthenticationException extends GenericException{

    private static final String message = ErrorCodes.AUTH_EXCEPTION;

    public AuthenticationException() {
        super(message);
    }
    public AuthenticationException(String message){
        super(message);
    }
}
