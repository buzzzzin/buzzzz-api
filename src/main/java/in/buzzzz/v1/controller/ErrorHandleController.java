package in.buzzzz.v1.controller;

import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.PrepareErrorResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandleController implements ErrorController {

    private static final String PATH = "/error";

    @Autowired
    private PrepareErrorResponseService prepareErrorResponseService;

    @RequestMapping(value = PATH, method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseDto error(@RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale) {
        return prepareErrorResponseService.handleError(locale);
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
