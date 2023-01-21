package ZUT.book;

import ZUT.book.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.NoSuchElementException;

public class BookService {
    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book addBook(Book Book){
        return bookRepository.save(Book);
    }
    public Book getById(Long id) {
        return bookRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Book not found with id " + id));
    }
    public Book updateBook(Long id, Book bookDetails) {
        Book book = getById(id);
        book.setTitle(bookDetails.getTitle());
        book.setDescription(bookDetails.getDescription());
        return bookRepository.save(bookDetails);
    }
    public String delete(Long id) {
        bookRepository.deleteById(id);
        return "(CODE 200)\n";
    }
}
