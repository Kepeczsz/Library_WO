package ZUT.role;

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
@Table(name = "role")

public class Role {
    @Id
    private Long Id;
    private String name;
}
