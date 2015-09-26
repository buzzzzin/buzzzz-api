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
            if (interestRepository.findByName("Blood") == null) {
                Interest interest = new Interest();
                interest.setName("Blood");
                interest.setImage("v1443273588/interest/blood.png");
                interest.setDateCreated(new Date());
                interest.setTrending(true);
                interest.setUsedCount(0l);
                interestRepository.save(interest);

                Interest interest2 = new Interest();
                interest2.setName("Music");
                interest2.setImage("v1443273587/interest/music.png");
                interest2.setDateCreated(new Date());
                interest2.setTrending(true);
                interest2.setUsedCount(0l);
                interestRepository.save(interest2);

                Interest interest7 = new Interest();
                interest7.setName("Coding");
                interest7.setImage("v1443274393/interest/coading.jpg");
                interest7.setDateCreated(new Date());
                interest7.setTrending(true);
                interest7.setUsedCount(0l);
                interestRepository.save(interest7);

                Interest interest6 = new Interest();
                interest6.setName("Party");
                interest6.setImage("v1443274270/interest/party.jpg");
                interest6.setDateCreated(new Date());
                interest6.setTrending(true);
                interest6.setUsedCount(0l);
                interestRepository.save(interest6);

                Interest interest5 = new Interest();
                interest5.setName("Running");
                interest5.setImage("v1443274165/interest/running.jpg");
                interest5.setDateCreated(new Date());
                interest5.setTrending(true);
                interest5.setUsedCount(0l);
                interestRepository.save(interest5);

                Interest interest3 = new Interest();
                interest3.setName("Sports");
                interest3.setImage("v1443273587/interest/sports.jpg");
                interest3.setDateCreated(new Date());
                interest3.setTrending(true);
                interest3.setUsedCount(0l);
                interestRepository.save(interest3);

                Interest interest4 = new Interest();
                interest4.setName("Technology");
                interest4.setImage("v1443273587/interest/technology.jpg");
                interest4.setDateCreated(new Date());
                interest4.setTrending(true);
                interest4.setUsedCount(0l);
                interestRepository.save(interest4);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("###########################");
        System.out.println("   END  BOOTSTRAP");
        System.out.println("###########################");
    }


}
