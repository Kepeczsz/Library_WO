package ZUT.user;

import ZUT.role.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;


@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    private Long id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private @NonNull Role role;
}
