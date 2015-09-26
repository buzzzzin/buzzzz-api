package in.buzzzz.repository.mapping;

import in.buzzzz.domain.mapping.UserAuthMapping;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserAuthMappingRepository extends MongoRepository<UserAuthMapping, String> {

    UserAuthMapping findByEmail(String email);

    UserAuthMapping findByAuthToken(String authToken);
}
