package ZUT.author;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "author")
public class Author {
    @Id
    private Long id;

    private String name;
    private String surname;
    private boolean gender;
    private LocalDate birthDay;
}
