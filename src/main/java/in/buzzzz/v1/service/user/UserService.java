package in.buzzzz.v1.service.user;

import in.buzzzz.domain.user.User;
import in.buzzzz.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ekansh on 25/9/15.
 */
@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public User save(User user){

        if(userRepository.countByEmail(user.getEmail())==0){
            user =  userRepository.save(user);
            return  user;
        }
        else{
            return user;
        }
    }

}
