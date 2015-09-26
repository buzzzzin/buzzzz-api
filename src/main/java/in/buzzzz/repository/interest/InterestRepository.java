package in.buzzzz.repository.interest;

import in.buzzzz.domain.interest.Interest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface InterestRepository extends MongoRepository<Interest, String> {

    Interest findById(String id);

    Interest findByName(String name);

    List<Interest> findAllByTrending(Boolean trending);
}
