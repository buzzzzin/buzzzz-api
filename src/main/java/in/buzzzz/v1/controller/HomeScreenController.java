package in.buzzzz.v1.controller;

import in.buzzzz.v1.co.home.HomeCommand;
import in.buzzzz.v1.data.response.ResponseDto;
import in.buzzzz.v1.response.home.PrepareHomeResponseService;
import in.buzzzz.v1.service.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ekansh on 26/9/15.
 */
@RestController
@RequestMapping(value = "/v1/home")
public class HomeScreenController {

    @Autowired private PrepareHomeResponseService prepareHomeResponseService;
    @Autowired private HomeService homeService;

    @RequestMapping(value = "/buzz")
    public ResponseDto buzz(@RequestBody HomeCommand homeCommand,
            @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale){


        return prepareHomeResponseService.buzzResponse(homeService.getHomeBuzzScreen(homeCommand),locale);
    }

    @RequestMapping(value = "/trending")
    public ResponseDto trending(@RequestBody HomeCommand homeCommand,
            @RequestHeader(value = "Accept-Language", defaultValue = "UK") String locale){


        return prepareHomeResponseService.trendingResponse(homeService.getHomeTrendingScreen(homeCommand),locale);
    }


}
