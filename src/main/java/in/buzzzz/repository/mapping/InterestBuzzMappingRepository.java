package in.buzzzz.repository.mapping;

import in.buzzzz.domain.mapping.InterestBuzzMapping;
import in.buzzzz.domain.mapping.TagBuzzMapping;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterestBuzzMappingRepository extends MongoRepository<InterestBuzzMapping,String> {

    InterestBuzzMapping findByInterestName(String tag);
    InterestBuzzMapping findByBuzzName(String buzzName);
    InterestBuzzMapping findByBuzzId(String buzzName);
}
