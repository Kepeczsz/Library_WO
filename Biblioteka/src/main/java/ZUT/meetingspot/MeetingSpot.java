package ZUT.meetingspot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "meetingspot")
public class MeetingSpot {
    @Id
    private int Id;
    private String name;
    private String City;
}
