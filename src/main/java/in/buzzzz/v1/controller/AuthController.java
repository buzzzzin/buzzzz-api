package in.buzzzz.v1.controller;

import in.buzzzz.domain.user.User;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.PrepareAuthResponseService;
import in.buzzzz.v1.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ekansh on 24/9/15.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired private PrepareAuthResponseService prepareAuthResponseService;
    @Autowired private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseDto login(@RequestBody User user){
        System.out.println(user.toString());
        return prepareAuthResponseService.loginResponse(userService.save(user));
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ResponseDto logout(){

        return prepareAuthResponseService.logoutResponse(null);
    }



}
