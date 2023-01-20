package ZUT.usermeeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMeetingController {
    UserMeetingService userMeetingService;
    @Autowired
    public UserMeetingController(UserMeetingService userMeetingService){
        this.userMeetingService = userMeetingService;
    }
}
