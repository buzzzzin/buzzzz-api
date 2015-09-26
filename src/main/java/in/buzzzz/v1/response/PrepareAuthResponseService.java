package in.buzzzz.v1.response;

import in.buzzzz.util.messages.SuccessCodes;
import in.buzzzz.v1.data.response.ResponseDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PrepareAuthResponseService extends Response {

    public ResponseDto loginResponse(Object data, String locale) {
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.LOGIN_SUCCESS, null, getLocale(locale)));
        return responseDto;
    }

    public ResponseDto logoutResponse(Object data, String locale) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", data);
        ResponseDto responseDto = new ResponseDto(map);
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.LOGOUT_SUCCESS, null, getLocale(locale)));
        return responseDto;
    }

    public ResponseDto authenticateResponse(Object data, String locale) {
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.BUZZ_CREATE_SUCCESS, null, getLocale(locale)));
        return responseDto;
    }

}
