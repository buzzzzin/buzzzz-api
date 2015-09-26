package in.buzzzz.v1.service.home;

import in.buzzzz.v1.co.home.HomeCommand;
import in.buzzzz.v1.data.home.HomeDto;
import org.springframework.stereotype.Service;

/**
 * Created by ekansh on 26/9/15.
 */
@Service
public class HomeService {

    public HomeDto getHomeBuzzScreen(HomeCommand homeCommand){
        HomeDto homeDto = new HomeDto();

        return homeDto;
    }

    public HomeDto getHomeTrendingScreen(HomeCommand homeCommand){
        HomeDto homeDto = new HomeDto();

        return homeDto;
    }

}
