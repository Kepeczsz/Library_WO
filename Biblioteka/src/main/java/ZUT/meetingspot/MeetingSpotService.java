package ZUT.meetingspot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingSpotService {
    private final MeetingSpotRepository meetingSpotRepository;
    @Autowired
    public MeetingSpotService(MeetingSpotRepository meetingSpotRepository){
        this.meetingSpotRepository = meetingSpotRepository;
    }
}
