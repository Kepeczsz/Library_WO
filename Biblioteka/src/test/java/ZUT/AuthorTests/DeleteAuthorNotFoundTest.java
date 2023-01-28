package ZUT.AuthorTests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DeleteAuthorNotFoundTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void deleteAuthorNoContent() throws Exception {

        mockMvc.perform(delete("/authors/1"))
                .andExpect(status().isNotFound());

    }
}
