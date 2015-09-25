package in.buzzzz.v1.controller;

import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.service.user.PrepareUserResponseService;
import in.buzzzz.v1.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ekansh on 25/9/15.
 */
@RestController
@RequestMapping(value = "/v1/user")
public class UserController {

    @Autowired private UserService userService;
    @Autowired private PrepareUserResponseService prepareUserResponseService;

    @RequestMapping("/myProfile")
    public ResponseDto myProfile(
            @RequestHeader(value = "X-Auth-Token", required = true) String authToken,
        @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale){
        return prepareUserResponseService.profileResponse(null,locale);
    }

    @RequestMapping("/othersProfile")
    public ResponseDto othersProfile(
            @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale){
        return prepareUserResponseService.profileResponse(null,locale);
    }

}
