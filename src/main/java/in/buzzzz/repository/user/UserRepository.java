package in.buzzzz.repository.user;

import in.buzzzz.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

    User findById(String id);
    Integer countByEmail(String email);
}
