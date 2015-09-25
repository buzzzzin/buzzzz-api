package in.buzzzz.v1.response;

import in.buzzzz.v1.data.response.ResponseDto;
import org.springframework.stereotype.Service;

/**
 * Created by ekansh on 25/9/15.
 */
@Service
public class PrepareErrorResponseService {

    public ResponseDto catchException(Exception e){
        ResponseDto responseDto = new ResponseDto(e);
        responseDto.setMessage(e.getMessage());
        return responseDto;
    }

}
