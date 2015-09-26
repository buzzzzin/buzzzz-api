package in.buzzzz.v1.response.interest;

import in.buzzzz.util.messages.SuccessCodes;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.Response;
import org.springframework.stereotype.Service;

@Service
public class PrepareInterestResponseService extends Response {

    public ResponseDto createInterestListResponse(Object data, String locale) {
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.INTEREST_LIST, null, getLocale(locale)));
        return responseDto;
    }

    public ResponseDto createSubscribeListResponse(Object data, String locale) {
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.SUBSCRIBE_LIST, null, getLocale(locale)));
        return responseDto;
    }
}
