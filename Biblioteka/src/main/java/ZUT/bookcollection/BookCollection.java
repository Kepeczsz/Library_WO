package ZUT.bookcollection;

import ZUT.book.Book;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookcollection")
public class BookCollection {
    @OneToMany
    @JoinColumn(name = "bookId")
    Book book;
}
