package in.buzzzz.v1.controller;

import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.services.response.PrepareAuthResponseService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseDto login(){

        return prepareAuthResponseService.loginResponse(null);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ResponseDto logout(){

        return prepareAuthResponseService.logoutResponse(null);
    }



}
