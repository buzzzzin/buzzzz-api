package in.buzzzz.v1.service.auth;

import in.buzzzz.domain.mapping.UserAuthMapping;
import in.buzzzz.domain.user.User;
import in.buzzzz.repository.mapping.UserAuthMappingRepository;
import in.buzzzz.repository.user.UserRepository;
import in.buzzzz.util.exceptions.AuthenticationException;
import in.buzzzz.v1.co.user.UserCommand;
import in.buzzzz.v1.data.login.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by ekansh on 26/9/15.
 */
@Service
public class AuthenticationService {

    @Autowired private UserRepository userRepository;
    @Autowired private UserAuthMappingRepository userAuthMappingRepository;

    public LoginDto login(UserCommand userCommand){
        User user = userRepository.findByEmail(userCommand.getEmail());
        LoginDto loginDto = new LoginDto();
        if(user==null){
            user = userRepository.save(new User(userCommand));
            loginDto.setUser(user.convertToUserInfoDto());
            loginDto.setHasInterests(false);
        }
        else{
            loginDto.setUser(user.convertToUserInfoDto());
            loginDto.setHasInterests(user.getInterests()!=null?user.getInterests().size()!=0:false);
        }
        UserAuthMapping userAuthMapping = userAuthMappingRepository.findByEmail(user.getEmail());
        if(userAuthMapping==null || userAuthMapping.getAuthToken()==null){
            userAuthMapping = new UserAuthMapping();
            userAuthMapping.setAuthToken((new Date()).hashCode() + "" + user.getEmail().hashCode());
            userAuthMapping.setEmail(user.getEmail());
            userAuthMapping = userAuthMappingRepository.save(userAuthMapping);
        }
        loginDto.setAuthToken(userAuthMapping.getAuthToken());
        return loginDto;
    }

    public boolean logout(String authToken){
        UserAuthMapping userAuthMapping = userAuthMappingRepository.findByAuthToken(authToken);
        if(userAuthMapping==null)
            throw new AuthenticationException();
        userAuthMapping.setAuthToken(null);
        userAuthMapping = userAuthMappingRepository.save(userAuthMapping);
        return userAuthMapping!=null;
    }
}
