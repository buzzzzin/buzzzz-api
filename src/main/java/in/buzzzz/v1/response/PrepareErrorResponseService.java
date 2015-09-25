package in.buzzzz.v1.response;

import in.buzzzz.util.messages.SuccessCodes;
import in.buzzzz.v1.data.response.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public class PrepareErrorResponseService extends Response {

    public ResponseDto catchException(Exception e, String locale) {
        ResponseDto responseDto = new ResponseDto(e);
        responseDto.setMessage(getMessageSource().getMessage(e.getMessage(), null, getLocale(locale)));
        return responseDto;
    }

    public ResponseDto handleError(String locale) {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setStatus(0);
        responseDto.setData("");
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.ERROR, null, getLocale(locale)));
        return responseDto;
    }

}
