package in.buzzzz.repository.buzz;

import in.buzzzz.domain.buzz.Buzz;
import org.springframework.data.geo.Circle;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BuzzRepository extends MongoRepository<Buzz, String> {

    Buzz findById(String id);

    Buzz findByName(String name);

    Buzz findByIsRSVP(Boolean isRSVP);

    List<Buzz> findByLocationWithin(Circle circle);

}
