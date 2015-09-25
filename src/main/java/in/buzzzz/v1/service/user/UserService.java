package in.buzzzz.v1.service.user;

import in.buzzzz.domain.user.User;
import in.buzzzz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ekansh on 25/9/15.
 */
@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

}
