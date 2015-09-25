package in.buzzzz.v1.response;

import in.buzzzz.util.messages.SuccessCodes;
import in.buzzzz.v1.data.response.ResponseDto;
import org.springframework.stereotype.Service;

/**
 * Created by ekansh on 25/9/15.
 */
@Service
public class PrepareAuthResponseService {

    public ResponseDto loginResponse(Object data){
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(SuccessCodes.LOGIN_SUCCESS);
        return responseDto;
    }

    public ResponseDto logoutResponse(Object data){
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(SuccessCodes.LOGOUT_SUCCESS);
        return responseDto;
    }

}
