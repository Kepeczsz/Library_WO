package ZUT.meetingspot;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "meetingspot")
public class MeetingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meeting_spot_sequence")
    @SequenceGenerator(name = "meeting_spot_sequence", sequenceName = "meeting_spot_sequence", allocationSize = 1)
    private Long Id;
    private String name;
    private String City;
}
