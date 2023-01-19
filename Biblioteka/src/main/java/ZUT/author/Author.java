package ZUT.author;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Author {
    @Id
    private int id;
    private String name;
    private String surname;
    private boolean gender;
    private LocalDate birthDay;
}
