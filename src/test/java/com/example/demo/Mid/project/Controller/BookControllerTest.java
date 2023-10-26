//package com.example.demo.Mid.project.Controller;
//
//import com.example.demo.Mid.project.Entity.Book;
//import com.example.demo.Mid.project.Service.Imp.onlineBookImp;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.aspectj.lang.annotation.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
//
//@ExtendWith(MockitoExtension.class)
//public class BookControllerTest {
//
//    @InjectMocks
//    private BookController bookController;
//
//    @Mock
//    private onlineBookImp online;
//
//
//    private MockMvc mockMvc;
//
//
//        // Create a Book instance
//
//
//
//
////    @Before
////    public void setUp() {
////        mockMvc = MockMvcBuilders.standaloneSetup(bookController).build();
////    }
//@Test
//public void testAddBook() throws Exception {
//    mockMvc = MockMvcBuilders.standaloneSetup(bookController).build(); // Initialize mockMvc within the test method
//
//    Book book = new Book(3, "Maha", "math", 80.75, 2008);
//
//    when(online.addbook(any(Book.class))).thenReturn(book);
//
//    mockMvc.perform(MockMvcRequestBuilders.post("/books/Admin/add")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .content(new ObjectMapper().writeValueAsString(book)))
//            .andExpect(MockMvcResultMatchers.status().isOk())
//            .andExpect(MockMvcResultMatchers.jsonPath("$.author").value("Maha"))
//            .andExpect(MockMvcResultMatchers.jsonPath("$.title").value("math"))
//            .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(80.75))
//            .andExpect(MockMvcResultMatchers.jsonPath("$.yearPublication").value(2008));
//}
//
////3	Maha	math	2008	80.75	20
//
//
//    // You can write your test methods here. For example:
////
////    @Test
////    public void testGetBookByTitle() throws Exception {
////        Book Book = new Book(1L, "Sample Book", "Author");
////        when(online.getBookbytitle("Sample Book")).thenReturn(book);
////
////        mockMvc.perform(get("/books/Sample Book"))
////                .andExpect(status().isOk())
////                .andExpect(jsonPath("$.title", is("Sample Book")));
////    }
//
//
//
//
//
//}
////3	Maha	math	2008	80.75	20
//
