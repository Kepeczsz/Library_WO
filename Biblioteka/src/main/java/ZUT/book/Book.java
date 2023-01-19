package ZUT.book;

import ZUT.author.Author;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.datetime.standard.DateTimeFormatterFactoryBean;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
    @Id
    private int id;
    private String title;
    private String description;
    private LocalDate localDate;

    @JoinColumn(name = "author_id")
    @ManyToMany
    Author author;
}
