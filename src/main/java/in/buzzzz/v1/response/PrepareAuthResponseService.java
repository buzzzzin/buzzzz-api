package in.buzzzz.v1.response;

import in.buzzzz.util.messages.SuccessCodes;
import in.buzzzz.v1.data.response.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class PrepareAuthResponseService extends Response{

    public ResponseDto loginResponse(Object data, String locale) {
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.LOGIN_SUCCESS, null, getLocale(locale)));
        return responseDto;
    }

    public ResponseDto logoutResponse(Object data, String locale) {
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.LOGOUT_SUCCESS, null, getLocale(locale)));
        return responseDto;
    }


}
