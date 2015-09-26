package in.buzzzz.v1.service.user;

import in.buzzzz.util.messages.SuccessCodes;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.Response;
import org.springframework.stereotype.Service;

@Service
public class PrepareUserResponseService extends Response {

    public ResponseDto profileResponse(Object data, String locale) {
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.USER_PROFILE_FETCH_SUCCESS,null,getLocale(locale)));
        return responseDto;
    }

}
