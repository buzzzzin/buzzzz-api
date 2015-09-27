package in.buzzzz.config.bootstrap;

import in.buzzzz.domain.buzz.Buzz;
import in.buzzzz.domain.buzz.Location;
import in.buzzzz.domain.buzz.Schedule;
import in.buzzzz.domain.interest.Interest;
import in.buzzzz.repository.buzz.BuzzRepository;
import in.buzzzz.repository.interest.InterestRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Component
public class Bootstrap implements InitializingBean {

    @Autowired
    private InterestRepository interestRepository;
    @Autowired
    private BuzzRepository buzzRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("###########################");
        System.out.println("   START BOOTSTRAP");
        System.out.println("###########################");
        try {
            if (interestRepository.count() == 0) {
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

            if (buzzRepository.count() == 0) {
                Buzz buzz3 = new Buzz();
                buzz3.setImageName("v1443273558/buzzzz/techathon-buzz.jpg");
                buzz3.setName("Tech-a-Thon - 2015");
                buzz3.setEmail("jeevesh@intelligrape.com");
                buzz3.setDateCreated(new Date());
                buzz3.setLastUpdated(new Date());
                buzz3.setIsRSVP(true);
                buzz3.setDescription("This is a coding event. Eat no Sleep Code Repeat");
                buzz3.setSchedule(new Schedule("25-09-2015 18:00:00", "27-09-2015 23:10:11", Schedule.Period.DAILY));
                buzz3.setLocation(new Location(28.535980, 77.345651, "Logix Techno prak, Sector-127, Noida"));
                buzz3.setTags(Arrays.asList("code", "no sleep"));
                buzz3.setInterests(Arrays.asList("Technology", "Coding"));
                buzzRepository.save(buzz3);

                Buzz buzz1 = new Buzz();
                buzz1.setName("Blood Donation in To The New");
                buzz1.setImageName("v1443273558/buzzzz/blooddonation-buzz.jpg");
                buzz1.setEmail("jeevesh@intelligrape.com");
                buzz1.setLocation(new Location(28.544116, 77.378769, "New Delhi"));
                buzz1.setTags(Arrays.asList("Blood", "donate", "health"));
                buzz1.setInterests(Arrays.asList("Blood", "Health"));
                buzz1.setDateCreated(new Date());
                buzz1.setLastUpdated(new Date());
                buzz1.setDescription("Done Blood and save others life");
                buzz1.setIsRSVP(true);
                buzz1.setSchedule(new Schedule("29-09-2015 09:00:00", "29-09-2015 23:10:11", Schedule.Period.DAILY));
                buzzRepository.save(buzz1);

                Buzz buzz2 = new Buzz();
                buzz2.setName("Grails Conf -15");
                buzz2.setImageName("v1443273559/buzzzz/grailscong-buzz.jpg");
                buzz2.setEmail("jeevesh@intelligrape.com");
                buzz2.setLocation(new Location(28.627925, 77.221527, "india habitat center, New Delhi"));
                buzz2.setTags(Arrays.asList("Grails", "groovy", "Spring Boot"));
                buzz2.setInterests(Arrays.asList("Technology", "Coding"));
                buzz2.setDateCreated(new Date());
                buzz2.setLastUpdated(new Date());
                buzz2.setIsRSVP(true);
                buzz2.setDescription("India's biggest Groovy and Grails conference in Delhi");
                buzz2.setSchedule(new Schedule("25-01-2016 09:00:00", "26-01-2016 23:10:11", Schedule.Period.DAILY));
                buzzRepository.save(buzz2);

                Buzz buzz = new Buzz();
                buzz.setImageName("v1443273559/buzzzz/airtel-buzz.jpg");
                buzz.setName("Airtel Delhi Half Marathon-15");
                buzz.setEmail("jeevesh@intelligrape.com");
                buzz.setLocation(new Location(28.562210, 77.161789, "India Gate,New Delhi"));
                buzz.setTags(Arrays.asList("running", "fitness", "sports"));
                buzz.setInterests(Arrays.asList("Running", "Sports"));
                buzz.setDateCreated(new Date());
                buzz.setLastUpdated(new Date());
                buzz.setIsRSVP(true);
                buzz.setDescription("Half Marathan");
                buzz.setSchedule(new Schedule("25-09-2015 18:00:00", "27-09-2015 23:10:11", Schedule.Period.DAILY));
                buzzRepository.save(buzz);

                Buzz buzz4 = new Buzz();
                buzz4.setImageName("v1443273558/buzzzz/buzz1.jpg");
                buzz4.setName("Party @ New Delhi");
                buzz4.setEmail("jeevesh@intelligrape.com");
                buzz4.setLocation(new Location(28.539894, 77.231827, "New Delhi"));
                buzz4.setTags(Arrays.asList("party", "night life", "enjoy"));
                buzz4.setInterests(Arrays.asList("Party", "Entainment"));
                buzz4.setDateCreated(new Date());
                buzz4.setLastUpdated(new Date());
                buzz4.setIsRSVP(true);
                buzz4.setDescription("Come join our party");
                buzz4.setSchedule(new Schedule("25-09-2015 18:00:00", "27-09-2015 23:10:11", Schedule.Period.DAILY));
                buzzRepository.save(buzz4);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("###########################");
        System.out.println("   END  BOOTSTRAP");
        System.out.println("###########################");
    }


}
