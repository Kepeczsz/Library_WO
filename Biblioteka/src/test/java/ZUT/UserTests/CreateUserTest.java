package ZUT.UserTests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class CreateUserTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addUser() throws Exception {

        String requestBody = "{\"name\":\"TestUsera\",\"surname\":\"Uzytkownik\"," +
                             "\"gender\": 0,\"birthDate\":\"2002-06-01\" }";
        mockMvc.perform(post("/authors/add").contentType(MediaType.APPLICATION_JSON)
                .content(requestBody))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"));
    }

}
