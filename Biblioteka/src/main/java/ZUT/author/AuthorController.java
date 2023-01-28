package ZUT.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping({"/authors"})
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }
    @GetMapping
    public List<Author> getAllAuthors(){
       return authorService.getAllAuthors();
    }
    @GetMapping({"/{id}"})
    public Author getAuthor(@PathVariable Long id) {
        return authorService.getById(id);
    }
    @PostMapping("/add")
    public Author addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }
    @PutMapping({"/{id}"})
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author authorDetails) {
        return authorService.updateAuthor(id, authorDetails);
    }
    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteAuthor(@PathVariable Long id) {
        if(authorService.delete(id))
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
