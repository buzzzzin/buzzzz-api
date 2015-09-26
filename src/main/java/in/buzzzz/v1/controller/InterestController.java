package in.buzzzz.v1.controller;

import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.v1.co.interest.InterestCommand;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.PrepareErrorResponseService;
import in.buzzzz.v1.response.interest.PrepareInterestResponseService;
import in.buzzzz.v1.service.interest.InterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/interest")
public class InterestController {

    @Autowired
    private PrepareInterestResponseService prepareInterestResponseService;
    @Autowired
    private PrepareErrorResponseService prepareErrorResponseService;
    @Autowired
    private InterestService interestService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseDto list(@RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        return prepareInterestResponseService.createInterestListResponse(interestService.list(), locale);
    }

    @RequestMapping(value = "/subscribe", method = RequestMethod.POST)
    public ResponseDto subscribe(@RequestBody(required = false) InterestCommand interest,
                                 @RequestHeader(value = "X-Auth-Token", required = true) String authToken,
                                 @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        return prepareInterestResponseService.createInterestListResponse(interestService.subscribe(interest, authToken), locale);
    }

    @ExceptionHandler(GenericException.class)
    private ResponseDto catchException(GenericException e) {
        return prepareErrorResponseService.catchException(e, null);
    }
}
