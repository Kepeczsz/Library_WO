package ZUT.meetingspot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "meetingspot")
public class MeetingSpot {
    @Id
    private Long Id;
    private String name;
    private String City;
}
