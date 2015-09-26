package in.buzzzz.v1.service.user;

import in.buzzzz.domain.buzz.Buzz;
import in.buzzzz.domain.mapping.UserAuthMapping;
import in.buzzzz.domain.user.User;
import in.buzzzz.repository.buzz.BuzzRepository;
import in.buzzzz.repository.mapping.UserAuthMappingRepository;
import in.buzzzz.repository.user.UserRepository;
import in.buzzzz.util.exceptions.auth.InvalidAuthTokenException;
import in.buzzzz.v1.data.user.UserProfileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;
    @Autowired private BuzzRepository buzzRepository;
    @Autowired private UserAuthMappingRepository userAuthMappingRepository;

    public UserProfileDto getMyProfile(String authToken){
        UserAuthMapping userAuthMapping = userAuthMappingRepository.findByAuthToken(authToken);
        if(userAuthMapping==null)
            throw new InvalidAuthTokenException();
        User user = userRepository.findByEmail(userAuthMapping.getEmail());
        UserProfileDto profileDto = user.convertToUserProfileDto();
        profileDto.setInterests(user.getInterests());
        profileDto.setBuzzs(Buzz.convertToDto(buzzRepository.findAllByEmail(user.getEmail())));
        return profileDto;
    }

    public UserProfileDto getOthersProfile(String userId){
        User user = userRepository.findById(userId);
        return user.convertToUserProfileDto();
    }

}
