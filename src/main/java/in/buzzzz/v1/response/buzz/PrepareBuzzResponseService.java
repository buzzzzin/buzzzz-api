package in.buzzzz.v1.response.buzz;

import in.buzzzz.util.messages.SuccessCodes;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.Response;
import org.springframework.stereotype.Service;

@Service
public class PrepareBuzzResponseService extends Response {

    public ResponseDto createBuzzResponse(Object data, String locale) {
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.BUZZ_CREATE_SUCCESS, null, getLocale(locale)));
        return responseDto;
    }
}
