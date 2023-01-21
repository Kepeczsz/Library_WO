package ZUT.book;

import ZUT.author.Author;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
    @Id
    private Long id;
    private String title;
    private String description;
    private LocalDate localDate;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private @NonNull Author book;
}
