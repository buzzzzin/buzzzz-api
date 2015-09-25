package in.buzzzz.v1.service.buzz;

import in.buzzzz.domain.buzz.Buzz;
import in.buzzzz.repository.buzz.BuzzRepository;
import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.util.exceptions.buzz.BuzzNotCreateException;
import in.buzzzz.v1.co.buzz.BuzzCommand;
import in.buzzzz.v1.data.buzz.BuzzDto;
import in.buzzzz.v1.service.tag.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class BuzzService {

    @Autowired
    private BuzzRepository buzzRepository;
    @Autowired
    private TagService tagService;

    public BuzzDto save(BuzzCommand buzzCommand) throws GenericException, ParseException {
        if (buzzCommand.validate()) {
            Buzz buzz = new Buzz(buzzCommand);
            buzzRepository.save(buzz);
            //TODO need to apply rabbit MQ call here
            tagService.createOrUpdateTags(buzzCommand.getTags());
            return buzz.convertToDto();
        }
        throw new BuzzNotCreateException();
    }
}
