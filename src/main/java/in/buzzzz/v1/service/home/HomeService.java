package in.buzzzz.v1.service.home;

import in.buzzzz.v1.co.location.LocationCommand;
import in.buzzzz.v1.data.home.HomeDto;
import in.buzzzz.v1.service.buzz.BuzzService;
import in.buzzzz.v1.service.interest.InterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ekansh on 26/9/15.
 */
@Service
public class HomeService {

    @Autowired private BuzzService buzzService;
    @Autowired private InterestService interestService;

    public HomeDto getHomeBuzzScreen(LocationCommand locationCommand){
        HomeDto homeDto = new HomeDto();
        homeDto.setBuzzs(buzzService.findBuzzNearMe(locationCommand));
        homeDto.setInterests(interestService.trendingInterests());
        return homeDto;
    }

    public HomeDto getHomeTrendingScreen(LocationCommand locationCommand){
        HomeDto homeDto = new HomeDto();

        return homeDto;
    }

}
