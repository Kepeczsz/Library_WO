package ZUT.bookCatalog;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class BookCatalog {
    @OneToMany
    @JoinColumn(name = "book_id")
    Long bookId;
}
