package ZUT.bookcatalog;

import ZUT.book.Book;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name = "bookcatalog")
public class BookCatalog {

    @JoinColumn(name = "book_id")
    Book book;
}
