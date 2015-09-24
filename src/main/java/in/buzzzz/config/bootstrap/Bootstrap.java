package in.buzzzz.config.bootstrap;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by ekansh on 24/9/15.
 */
@Component
public class Bootstrap implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
    System.out.println("###########################");
    System.out.println("   START BOOTSTRAP");
    System.out.println("###########################");





    System.out.println("###########################");
    System.out.println("   END  BOOTSTRAP");
    System.out.println("###########################");
    }


}
