package in.buzzzz.repository.rsvp;

import in.buzzzz.domain.buzz.Buzz;
import in.buzzzz.domain.rsvp.RSVP;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RSVPRepository extends MongoRepository<RSVP, String> {

    RSVP findById(String id);

    RSVP findByEmail(String email);

    RSVP findByBuzzId(String buzzId);

    RSVP findByStatus(RSVP.RSVPStatus status);

    RSVP findByBuzzIdAndEmail(String buzzId, String email);
}
