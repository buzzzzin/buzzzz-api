package in.buzzzz.v1.service.tag;

import in.buzzzz.domain.tag.Tag;
import in.buzzzz.repository.tag.TagRepository;
import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.util.exceptions.buzz.BuzzNotCreateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public Object save(String tag) throws GenericException {
        if (tag != null) {
            Tag tagInstance = new Tag(tag);
            tagRepository.save(tagInstance);
            return null;
        }
        throw new BuzzNotCreateException();
    }

    public void createOrUpdateTags(List<String> tags) {
        for (String tag : tags) {
            Tag tagInstance = tagRepository.findByTag(tag);
            if (tagInstance == null) {
                save(tag);
            } else {
                tagInstance.setUsedCount(tagInstance.getUsedCount() + 1);
                tagRepository.save(tagInstance);
            }
        }
    }
}
