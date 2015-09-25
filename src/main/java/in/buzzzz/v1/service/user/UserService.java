package in.buzzzz.v1.service.user;

import in.buzzzz.domain.user.User;
import in.buzzzz.repository.user.UserRepository;
import in.buzzzz.v1.data.login.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ekansh on 25/9/15.
 */
@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public LoginDto login(User user){
        if(userRepository.countByEmail(user.getEmail())==0){
            LoginDto loginDto = new LoginDto();
            loginDto.setUser(userRepository.save(user).convertToDto());
            loginDto.setHasInterests(false);
            return loginDto;
        }
        else{
            return null;
        }
    }

}
