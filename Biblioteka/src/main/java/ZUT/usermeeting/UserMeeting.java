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
    @JoinColumn(name="user_id")
    @MapsId("userId")
    User user;

    @ManyToOne
    @JoinColumn(name="meeting_id")
    @MapsId("meetingSpotId")
    MeetingSpot meetingSpot;

    LocalDate dateOfMeeting;
}
