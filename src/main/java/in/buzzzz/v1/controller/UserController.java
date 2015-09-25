package in.buzzzz.v1.controller;

import in.buzzzz.v1.data.response.ResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ekansh on 25/9/15.
 */
@RestController
@RequestMapping(value = "/v1/user")
public class UserController {

    @RequestMapping("/profile")
    public ResponseDto profile(){
        return null;
    }

}
