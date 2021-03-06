package in.buzzzz.repository.buzz;

import in.buzzzz.domain.buzz.Buzz;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BuzzRepository extends MongoRepository<Buzz, String> {

    Buzz findById(String id);

    Buzz findByName(String name);

    Buzz findByIsRSVP(Boolean isRSVP);

    List<Buzz> findByLocationWithin(Circle circle);
    List<Buzz> findByLocationNear(Point p, Distance distance);

    List<Buzz> findByInterestsInAndLocationWithin(List<String> interests, Circle circle);

    List<Buzz> findAllByEmail(String email);
}
