package ZUT.meetingspot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private Long Id;
    private String name;
    private String City;
}
