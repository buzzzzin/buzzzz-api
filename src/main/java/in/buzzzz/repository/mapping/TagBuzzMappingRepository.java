package in.buzzzz.repository.mapping;

import in.buzzzz.domain.mapping.TagBuzzMapping;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TagBuzzMappingRepository extends MongoRepository<TagBuzzMapping,String> {

    TagBuzzMapping findByTag(String tag);
    TagBuzzMapping findByBuzzName(String buzzName);
}
