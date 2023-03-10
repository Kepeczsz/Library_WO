package ZUT.user;

import ZUT.role.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.NonNull;


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
    private @NonNull String name;
    private @NonNull String surname;
    private @NonNull String login;
    private @NonNull String password;
    private @NonNull String email;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private @NonNull Role role;
}
