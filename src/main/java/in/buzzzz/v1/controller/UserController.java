package in.buzzzz.v1.controller;

import in.buzzzz.v1.data.response.ResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ekansh on 25/9/15.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping("/list")
    public ResponseDto list(){
        return null;
    }

}
