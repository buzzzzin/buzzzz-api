package in.buzzzz.v1.service.user;

import in.buzzzz.domain.mapping.UserAuthMapping;
import in.buzzzz.domain.user.User;
import in.buzzzz.repository.mapping.UserAuthMappingRepository;
import in.buzzzz.repository.user.UserRepository;
import in.buzzzz.v1.data.user.UserProfileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ekansh on 25/9/15.
 */
@Service
public class UserService {

    @Autowired private UserRepository userRepository;
    @Autowired private UserAuthMappingRepository userAuthMappingRepository;

    public UserProfileDto getMyProfile(String authToken){
        UserAuthMapping userAuthMapping = userAuthMappingRepository.findByAuthToken(authToken);
//        if(userAuthMapping==null)

        User user = userRepository.findByEmail(userAuthMapping.getEmail()); 
        UserProfileDto profileDto = new UserProfileDto();
        profileDto.setUser(null);
        profileDto.setStats(null);
        return profileDto;
    }

    public UserProfileDto getOthersProfile(String userId){
        User user = userRepository.findById(userId);
        UserProfileDto profileDto = new UserProfileDto();
        profileDto.setUser(user.convertToUserInfoDto());
        profileDto.setStats(null);
        return profileDto;
    }

}
