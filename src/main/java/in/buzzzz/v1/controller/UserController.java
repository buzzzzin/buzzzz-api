package in.buzzzz.v1.controller;

import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.PrepareErrorResponseService;
import in.buzzzz.v1.service.user.PrepareUserResponseService;
import in.buzzzz.v1.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private PrepareUserResponseService prepareUserResponseService;
    @Autowired
    private PrepareErrorResponseService prepareErrorResponseService;

    @RequestMapping("/myProfile")
    public ResponseDto myProfile(
            @RequestHeader(value = "X-Auth-Token", required = true) String authToken,
            @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        return prepareUserResponseService.profileResponse(authToken, locale);
    }

    @RequestMapping("/othersProfile/{id}")
    public ResponseDto othersProfile(@PathVariable("id") String userId,
                                     @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        return prepareUserResponseService.profileResponse(userService.getOthersProfile(userId), locale);
    }


    @ExceptionHandler(GenericException.class)
    private ResponseDto catchException(GenericException e) {
        return prepareErrorResponseService.catchException(e, null);
    }
}
