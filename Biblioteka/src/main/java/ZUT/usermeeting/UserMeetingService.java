package ZUT.usermeeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMeetingService {
    private final UserMeetingRepository userMeetingRepository;

    @Autowired
    public UserMeetingService(UserMeetingRepository userMeetingRepository){
        this.userMeetingRepository = userMeetingRepository;
    }
}
