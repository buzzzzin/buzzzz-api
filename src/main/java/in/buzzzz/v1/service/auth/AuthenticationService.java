package in.buzzzz.v1.service.auth;

import in.buzzzz.domain.mapping.UserAuthMapping;
import in.buzzzz.domain.user.User;
import in.buzzzz.repository.mapping.UserAuthMappingRepository;
import in.buzzzz.repository.user.UserRepository;
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
        System.out.println("11111111111111111");
        if(user==null){
            user = userRepository.save(new User(userCommand));
            loginDto.setUser(user.convertToDto());
            loginDto.setHasInterests(false);
            System.out.println("aaaaaaaaaaaaaaaaaa");
        }
        else{
            loginDto.setUser(user.convertToDto());
            loginDto.setHasInterests(user.getInterests().size()!=0);
            System.out.println("bbbbbbbbbbbbbbbbbbbbbb");
        }
        UserAuthMapping userAuthMapping = userAuthMappingRepository.findByEmail(user.getEmail());
        System.out.println("22222222222222222222222222");
        if(userAuthMapping==null){
            System.out.println("aaaaaaaaaaaaaaaaaaaaa");
            userAuthMapping = new UserAuthMapping();
            System.out.println("xxxx");
            userAuthMapping.setAuthToken((new Date()).hashCode() + "" + user.getEmail().hashCode());
            System.out.println("yyy");
            userAuthMapping.setEmail(user.getEmail());
            System.out.println("zzz" + (userAuthMapping ==null) + "" + (userAuthMappingRepository==null));
            userAuthMappingRepository.save(userAuthMapping);
            System.out.println("vbbbbbbbbbbbbbbbbbbbbbbbbb");
        }
        System.out.println("33333333333333333333");
        loginDto.setAuthToken("token");
        return loginDto;
    }

    private void authManage(){

    }
}
