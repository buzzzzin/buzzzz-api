package in.buzzzz.repository.interest;

import in.buzzzz.domain.interest.Interest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterestRepository extends MongoRepository<Interest, String> {

    Interest findById(String id);

    Interest findByName(String name);
}
