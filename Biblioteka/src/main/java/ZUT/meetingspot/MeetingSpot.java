package ZUT.meetingspot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MeetingSpot {
    @Id
    private int Id;
    private String name;
    private String City;
}
