package in.buzzzz.v1.service.buzz;

import in.buzzzz.repository.buzz.BuzzRepository;
import in.buzzzz.v1.co.buzz.BuzzCommand;
import in.buzzzz.v1.data.buzz.BuzzDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuzzService {

    @Autowired
    private BuzzRepository userRepository;

    public BuzzDto save(BuzzCommand buzzCommand) {
        return new BuzzDto();
    }
}
