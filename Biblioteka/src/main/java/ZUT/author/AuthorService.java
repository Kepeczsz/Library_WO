package ZUT.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }
    public Author getById(Long id) {
        return authorRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Author not found with id " + id));
    }
    public Author updateAuthor(Long id, Author authorDetails) {
        Author author = getById(id);
        author.setName(authorDetails.getName());
        author.setSurname(authorDetails.getSurname());
        return authorRepository.save(authorDetails);
    }
    public boolean delete(Long id) {
        if (authorRepository.existsById(id)) {
            authorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
