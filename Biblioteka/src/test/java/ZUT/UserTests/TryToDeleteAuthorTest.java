//package ZUT.UserTests;
//
//import ZUT.author.AuthorController;
//import ZUT.author.AuthorService;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.times;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(AuthorController.class)
//public class TryToDeleteAuthorTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private AuthorController authorService;
//
//    @Test
//    public void testDeleteAuthor() throws Exception {
//        // setup mock service to return a success status
//        doNothing().when(authorService).deleteAuthor(52L);
//
//        // perform DELETE request on "/authors/1" and assert that the response status is 200 OK
//        mockMvc.perform(delete("/authors/52"))
//                .andExpect(status().isOk());
//
//        // verify that the deleteAuthor method on the mock service was called once with the correct argument
//        verify(authorService, times(1)).deleteAuthor(52L);
//    }
//}