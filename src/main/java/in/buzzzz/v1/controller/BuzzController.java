package in.buzzzz.v1.controller;

import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.v1.co.buzz.BuzzCommand;
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
    public ResponseDto save(@RequestBody(required = false) BuzzCommand buzz,
                            @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) throws ParseException {
        System.out.println(buzz.toString());
        return prepareBuzzResponseService.createBuzzResponse(buzzService.save(buzz), locale);
    }

    @RequestMapping(value = "/preview/{id}", method = RequestMethod.GET)
    public ResponseDto preview(@PathVariable("id") String buzzId,
                               @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) throws ParseException {
        System.out.println(buzzId);
        return prepareBuzzResponseService.createBuzzResponse(buzzService.preview(buzzId), locale);
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
