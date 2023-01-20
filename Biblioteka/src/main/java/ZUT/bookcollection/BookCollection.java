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
    @Column(name = "id", nullable = false)
    private Long id;

    @JoinColumn(name = "bookId")
    Book book;

    @JoinColumn(name = "userId")
    @OneToOne
    User user;
}
