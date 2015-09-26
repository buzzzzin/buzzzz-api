package in.buzzzz.v1.response.home;

import in.buzzzz.util.messages.SuccessCodes;
import in.buzzzz.v1.data.response.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Created by ekansh on 26/9/15.
 */
@Service
public class PrepareHomeResponseService {

    @Autowired
    private MessageSource messageSource;
    public Locale getLocale(String locale) {
        return new Locale(locale);
    }

    public ResponseDto buzzResponse(Object data,String locale){
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(messageSource.getMessage(SuccessCodes.HOME_BUZZ,null,getLocale(locale)));
        return responseDto;
    }

    public ResponseDto trendingResponse(Object data,String locale){
        ResponseDto responseDto = new ResponseDto(data);
        responseDto.setMessage(messageSource.getMessage(SuccessCodes.HOME_TRENDING,null,getLocale(locale)));
        return responseDto;
    }

}
