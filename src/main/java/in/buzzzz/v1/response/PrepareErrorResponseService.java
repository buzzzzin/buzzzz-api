package in.buzzzz.v1.response;

import in.buzzzz.v1.data.response.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public class PrepareErrorResponseService extends Response {

    public ResponseDto catchException(Exception e, String locale) {
        ResponseDto responseDto = new ResponseDto(e);
        responseDto.setMessage(getMessageSource().getMessage(e.getMessage(), null, getLocale(locale)));
        return responseDto;
    }

}
