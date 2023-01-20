package ZUT.usermeeting;

import ZUT.meetingspot.MeetingSpot;
import ZUT.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "usermeeting")
public class UserMeeting  {

    @EmbeddedId
    UserMeetingKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name="user_id")
    private @NonNull User user;

    @ManyToOne
    @MapsId("meetingSpotId")
    @JoinColumn(name="meetingspot_id")
    private @NonNull MeetingSpot meetingSpot;

    LocalDate dateOfMeeting;
}
