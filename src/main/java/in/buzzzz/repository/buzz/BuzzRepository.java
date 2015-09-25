package in.buzzzz.repository.buzz;

import in.buzzzz.domain.buzz.Buzz;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BuzzRepository extends MongoRepository<Buzz, String> {

    Buzz findById(String id);

    Buzz findByName(String name);

    Buzz findByIsRSVP(Boolean isRSVP);
}
