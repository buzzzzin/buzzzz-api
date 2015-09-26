package in.buzzzz.v1.service.buzz;

import in.buzzzz.data.rsvp.RSVPData;
import in.buzzzz.domain.buzz.Buzz;
import in.buzzzz.domain.buzz.BuzzStats;
import in.buzzzz.domain.mapping.TagBuzzMapping;
import in.buzzzz.domain.rsvp.RSVP;
import in.buzzzz.repository.buzz.BuzzRepository;
import in.buzzzz.repository.rsvp.RSVPRepository;
import in.buzzzz.util.exceptions.GenericException;
import in.buzzzz.util.exceptions.buzz.BuzzNotCreateException;
import in.buzzzz.util.exceptions.buzz.BuzzNotFoundException;
import in.buzzzz.util.exceptions.buzz.RSVPNotCreatedException;
import in.buzzzz.util.mq.TagBuzzMappingDto;
import in.buzzzz.v1.co.buzz.BuzzCommand;
import in.buzzzz.v1.co.location.LocationCommand;
import in.buzzzz.v1.co.rsvp.RSVPCommand;
import in.buzzzz.v1.data.buzz.BuzzDto;
import in.buzzzz.v1.service.auth.AuthenticationService;
import in.buzzzz.v1.service.tag.TagBuzzMappingService;
import in.buzzzz.v1.service.tag.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

@Service
public class BuzzService {

    @Autowired
    private BuzzRepository buzzRepository;
    @Autowired
    private TagService tagService;
    @Autowired
    private RSVPRepository rsvpRepository;
    @Autowired
    private TagBuzzMappingService tagBuzzMappingService;
    @Autowired
    private AuthenticationService authenticationService;

    public List<BuzzDto> findBuzzNearMe(LocationCommand locationCommand) {
        List<BuzzDto> buzzDtos = new LinkedList<BuzzDto>();

        return buzzDtos;
    }


    public BuzzDto save(String authToken, BuzzCommand buzzCommand) throws GenericException, ParseException {
        String email = authenticationService.authenticateToken(authToken);
        buzzCommand.setAuthEmail(email);
        if (buzzCommand.validate()) {
            Buzz buzz = new Buzz(buzzCommand);
            buzzRepository.save(buzz);

            //TODO need to apply rabbit MQ call here
            TagBuzzMappingDto tagBuzzMappingDto = TagBuzzMapping.populateTagBuzzMappingDto(buzz);
            tagService.createOrUpdateTags(buzzCommand.getTags());
            tagBuzzMappingService.createTagBuzzMapping(tagBuzzMappingDto);
            return buzz.convertToDto();
        }
        throw new BuzzNotCreateException();
    }

    public BuzzDto preview(String buzzId) throws GenericException {
        if (buzzId != null) {
            Buzz buzz = buzzRepository.findById(buzzId);
            if (buzz == null) {
                throw new BuzzNotFoundException();
            }
            return buzz.convertToDto();
        }
        throw new BuzzNotFoundException();
    }

    public RSVPData rsvp(RSVPCommand rsvpCommand) throws GenericException {
        rsvpCommand.setAuthEmail("jeevesh+1@gmail.com");
        if (rsvpCommand.validate()) {
            Buzz buzz = buzzRepository.findById(rsvpCommand.getBuzzId());
            if (buzz == null) {
                throw new BuzzNotFoundException();
            }
            RSVP rsvp = rsvpRepository.findByBuzzIdAndEmail(rsvpCommand.getBuzzId(), rsvpCommand.getAuthEmail());
            if (rsvp != null) {
                //TODO:Make this task asynk
                updateRSVPStatsToBuzz(rsvp, buzz);
                rsvp.setStatus(rsvpCommand.getStatus());
            } else {
                rsvp = new RSVP(rsvpCommand);
            }
            //TODO:Make this task asynk
            addRSVPStatsToBuzz(rsvpCommand, buzz);
            rsvpRepository.save(rsvp);
            return rsvp.convertToDto();
        }
        throw new RSVPNotCreatedException();
    }

    private void addRSVPStatsToBuzz(RSVPCommand rsvpCommand, Buzz buzz) {
        BuzzStats buzzStats = buzz.getStats() == null ? new BuzzStats() : buzz.getStats();
        if (rsvpCommand.getStatus() == RSVP.RSVPStatus.YES) {
            buzzStats.setGoingCount(buzzStats.getGoingCount() == null ? 1l : buzzStats.getGoingCount() + 1);
        }
        if (rsvpCommand.getStatus() == RSVP.RSVPStatus.NO) {
            buzzStats.setNotComingCount(buzzStats.getNotComingCount() == null ? 1l : buzzStats.getNotComingCount() + 1);
        }
        if (rsvpCommand.getStatus() == RSVP.RSVPStatus.MAY_BE) {
            buzzStats.setMayBeCount(buzzStats.getMayBeCount() == null ? 1l : buzzStats.getMayBeCount() + 1);
        }
        buzz.setStats(buzzStats);
        buzzRepository.save(buzz);
    }

    private void updateRSVPStatsToBuzz(RSVP rsvp, Buzz buzz) {
        BuzzStats buzzStats = buzz.getStats() == null ? new BuzzStats() : buzz.getStats();
        if (rsvp.getStatus() == RSVP.RSVPStatus.YES) {
            buzzStats.setGoingCount(buzzStats.getGoingCount() == null ? 0 : buzzStats.getGoingCount() - 1);
        }
        if (rsvp.getStatus() == RSVP.RSVPStatus.NO) {
            buzzStats.setNotComingCount(buzzStats.getNotComingCount() == null ? 0 : buzzStats.getNotComingCount() - 1);
        }
        if (rsvp.getStatus() == RSVP.RSVPStatus.MAY_BE) {
            buzzStats.setMayBeCount(buzzStats.getMayBeCount() == null ? 0 : buzzStats.getMayBeCount() - 1);
        }
        buzz.setStats(buzzStats);
        buzzRepository.save(buzz);
    }
}
