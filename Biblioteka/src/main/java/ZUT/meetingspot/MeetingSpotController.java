package ZUT.meetingspot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/meetingspot"})
public class MeetingSpotController {
    private final MeetingSpotService meetingSpotService;
    @Autowired
    public MeetingSpotController(MeetingSpotService meetingSpotService){
        this.meetingSpotService = meetingSpotService;
    }
}
