package ZUT.bookcollection;

import ZUT.book.Book;
import ZUT.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "bookcollection")
public class BookCollection {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JoinColumn(name = "book_id")
    @ManyToOne
    Book book;

    @JoinColumn(name = "user_id")
    @OneToOne
    User user;
}
