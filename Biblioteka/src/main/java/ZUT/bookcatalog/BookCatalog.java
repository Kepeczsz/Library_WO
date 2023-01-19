package ZUT.bookcatalog;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "bookcatalog")
public class BookCatalog {
    @OneToMany
    @JoinColumn(name = "book_id")
    Long bookId;
}
