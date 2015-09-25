package in.buzzzz.repository.interest;

import in.buzzzz.domain.buzz.Buzz;
import in.buzzzz.domain.interest.Interest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterestRepository extends MongoRepository<Interest, String> {

    Buzz findById(String id);

    Buzz findByName(String name);
}
