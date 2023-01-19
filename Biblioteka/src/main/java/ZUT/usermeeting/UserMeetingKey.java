package ZUT.usermeeting;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
class UserMeetingKey implements Serializable {

    @Column(name = "user_id")
    Long userId;

    @Column(name = "meetingspot_id")
    Long meetingSpotId;
}
