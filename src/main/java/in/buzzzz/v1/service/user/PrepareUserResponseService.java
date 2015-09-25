package in.buzzzz.v1.service.user;

import in.buzzzz.util.messages.SuccessCodes;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.Response;
import org.springframework.stereotype.Service;

/**
 * Created by ekansh on 26/9/15.
 */
@Service
public class PrepareUserResponseService extends Response{

    public ResponseDto profileResponse(Object data,String locale){
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(getMessageSource().getMessage(SuccessCodes.BUZZ_CREATE_SUCCESS,null,getLocale(locale)));
        return responseDto;
    }

}
