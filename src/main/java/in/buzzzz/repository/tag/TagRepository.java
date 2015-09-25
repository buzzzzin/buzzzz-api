package in.buzzzz.repository.tag;

import in.buzzzz.domain.mapping.UserAuthMapping;
import in.buzzzz.domain.tag.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TagRepository extends MongoRepository<Tag, String> {
    UserAuthMapping findByTag(String email);
}
