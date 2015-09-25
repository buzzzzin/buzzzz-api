package in.buzzzz.v1.service.tag;

import in.buzzzz.domain.mapping.TagBuzzMapping;
import in.buzzzz.repository.mapping.TagBuzzMappingRepository;
import in.buzzzz.util.mq.TagBuzzMappingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TagBuzzMappingService {

    @Autowired
    private TagBuzzMappingRepository tagBuzzMappingRepository;

    public void createTagBuzzMapping(TagBuzzMappingDto tagBuzzMappingDto) {
        List<String> tags = tagBuzzMappingDto.getTags();
        for (String tag : tags) {
            saveTagBuzzMapping(tag, tagBuzzMappingDto.getBuzzName(), tagBuzzMappingDto.getBuzzId());
        }
    }

    public void saveTagBuzzMapping(String tag, String buzzName, String buzzId) {
        TagBuzzMapping tagBuzzMapping = new TagBuzzMapping();
        tagBuzzMapping.setTag(tag);
        tagBuzzMapping.setBuzzName(buzzName);
        tagBuzzMapping.setBuzzId((buzzId));
        tagBuzzMapping.setDateCreated(new Date());
        tagBuzzMapping.setLastUpdated(new Date());
        tagBuzzMappingRepository.save(tagBuzzMapping);
    }
}
