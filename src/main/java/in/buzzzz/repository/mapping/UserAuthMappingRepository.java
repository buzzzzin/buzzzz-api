package in.buzzzz.repository.mapping;

import in.buzzzz.domain.mapping.UserAuthMapping;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ekansh on 26/9/15.
 */
public interface UserAuthMappingRepository extends MongoRepository<UserAuthMapping,String> {

    UserAuthMapping findByEmail(String email);
    UserAuthMapping findByAuthToken(String authToken);
}
