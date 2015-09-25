package in.buzzzz.v1.controller;

import in.buzzzz.domain.user.User;
import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.PrepareAuthResponseService;
import in.buzzzz.v1.response.PrepareErrorResponseService;
import in.buzzzz.v1.service.user.UserService;
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
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseDto login(@RequestBody User user,
                             @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        System.out.println(user.toString());
        return prepareAuthResponseService.loginResponse(userService.save(user), locale);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ResponseDto logout(
            @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        return prepareAuthResponseService.logoutResponse(null, locale);
    }

    @ExceptionHandler(GenericException.class)
    private ResponseDto catchException(GenericException e) {
        return prepareErrorResponseService.catchException(e, null);
    }


}
