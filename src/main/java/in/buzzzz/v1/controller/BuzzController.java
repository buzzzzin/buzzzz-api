package in.buzzzz.v1.controller;

import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.v1.co.buzz.BuzzByInterestCommand;
import in.buzzzz.v1.co.buzz.BuzzCommand;
import in.buzzzz.v1.co.location.LocationCommand;
import in.buzzzz.v1.co.rsvp.RSVPCommand;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.PrepareErrorResponseService;
import in.buzzzz.v1.response.buzz.PrepareBuzzResponseService;
import in.buzzzz.v1.service.buzz.BuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping(value = "/buzz")
public class BuzzController {

    @Autowired
    private PrepareBuzzResponseService prepareBuzzResponseService;
    @Autowired
    private PrepareErrorResponseService prepareErrorResponseService;
    @Autowired
    private BuzzService buzzService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseDto save(@RequestBody BuzzCommand buzz,
                            @RequestHeader(value = "X-Auth-Token", required = true) String authToken,
                            @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) throws ParseException {
        System.out.println(buzz.toString());
        return prepareBuzzResponseService.createBuzzResponse(buzzService.save(authToken, buzz), locale);
    }

    @RequestMapping(value = "/preview/{id}", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseDto preview(@PathVariable("id") String buzzId,
                               @RequestHeader(value = "X-Auth-Token", required = false) String authToken,
                               @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        System.out.println(buzzId);
        return prepareBuzzResponseService.createBuzzPrevireResponse(buzzService.preview(buzzId, authToken), locale);
    }

    @RequestMapping(value = "/buzzByInterest")
    public ResponseDto findAllBuzzByInterest(@RequestBody BuzzByInterestCommand buzzByInterestCommand,
                                             @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        return prepareBuzzResponseService.createAllBuzzByInterestResponse(buzzService.findAllBuzzByInterest(buzzByInterestCommand), locale);
    }

    @RequestMapping(value = "/trending")
    public ResponseDto trending(@RequestBody LocationCommand locationCommand,
                                             @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        return prepareBuzzResponseService.createAllBuzzByInterestResponse(buzzService.trending(locationCommand), locale);
    }

    @RequestMapping(value = "/rsvp", method = RequestMethod.POST)
    public ResponseDto rsvp(@RequestBody(required = false) RSVPCommand rsvpCommand,
                            @RequestHeader(value = "X-Auth-Token", required = true) String authToken,
                            @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        System.out.println(rsvpCommand.toString());
        return prepareBuzzResponseService.createRSVPResponse(buzzService.rsvp(authToken, rsvpCommand), locale);
    }

    @ExceptionHandler(GenericException.class)
    private ResponseDto catchException(GenericException e) {
        return prepareErrorResponseService.catchException(e, null);
    }

    @ExceptionHandler(ParseException.class)
    private ResponseDto catchException(ParseException e) {
        return prepareErrorResponseService.catchException(e, null);
    }
}
