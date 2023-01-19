package ZUT.book;

import ZUT.author.Author;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import org.springframework.format.datetime.standard.DateTimeFormatterFactoryBean;

import java.time.LocalDate;

@Entity
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
