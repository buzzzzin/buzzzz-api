package in.buzzzz.v1.controller;

import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.v1.co.user.UserCommand;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.PrepareAuthResponseService;
import in.buzzzz.v1.response.PrepareErrorResponseService;
import in.buzzzz.v1.service.auth.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private PrepareAuthResponseService prepareAuthResponseService;
    @Autowired
    private PrepareErrorResponseService prepareErrorResponseService;
    @Autowired
    private AuthenticationService authenticationService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseDto login(@RequestBody UserCommand userCommand,
                             @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        System.out.println(userCommand.toString());
        return prepareAuthResponseService.loginResponse(authenticationService.login(userCommand), locale);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ResponseDto logout(
            @RequestHeader(value = "X-Auth-Token", required = true) String authToken,
            @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        return prepareAuthResponseService.logoutResponse(authenticationService.logout(authToken), locale);
    }

    @ExceptionHandler(GenericException.class)
    private ResponseDto catchException(GenericException e) {
        return prepareErrorResponseService.catchException(e, null);
    }


}
