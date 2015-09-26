package in.buzzzz.config.bootstrap;

import in.buzzzz.domain.interest.Interest;
import in.buzzzz.repository.interest.InterestRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Bootstrap implements InitializingBean {

    @Autowired
    private InterestRepository interestRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("###########################");
        System.out.println("   START BOOTSTRAP");
        System.out.println("###########################");
        try {
            if (interestRepository.findByName("One") == null) {
                Interest interest = new Interest();
                interest.setName("One");
                interest.setImage("One");
                interest.setDateCreated(new Date());
                interest.setTrending(true);
                interestRepository.save(interest);
                for (int i = 0; i <= 10; i++) {
                    Interest interest1 = new Interest();
                    interest1.setName("Interest" + i);
                    interest1.setImage("Interest" + i);
                    interest1.setDateCreated(new Date());
                    interest1.setTrending(true);
                    interestRepository.save(interest1);
                }
            }
            if (interestRepository.count() == 0) {
                for (int i = 0; i <= 20; i++) {
                    Interest interest = new Interest();
                    interest.setName("Interest" + i);
                    interest.setImage("Interest" + i);
                    interest.setDateCreated(new Date());
                    interestRepository.save(interest);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("###########################");
        System.out.println("   END  BOOTSTRAP");
        System.out.println("###########################");
    }


}
