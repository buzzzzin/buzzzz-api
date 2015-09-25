package in.buzzzz.repository;

import in.buzzzz.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ekansh on 25/9/15.
 */

public interface UserRepository extends MongoRepository<User,Long> {
}
