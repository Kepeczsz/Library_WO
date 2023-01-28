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
public class DeleteUserTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void deleteUser() throws Exception {
        // delete
        mockMvc.perform(delete("/authors/507")).andExpect(status().isOk());

        String requestBody = "{\"id\":\"507\",\"name\":\"TestUsera\",\"surname\":\"Uzytkownik\"," +
                "\"gender\": 0,\"birthDate\":\"2002-06-01\" }";
    }
}
