package com.example.demo.Mid.project.Controller;


import com.example.demo.Mid.project.Entity.Admin;
import com.example.demo.Mid.project.Entity.Book;
import com.example.demo.Mid.project.Entity.Customer;
import com.example.demo.Mid.project.Entity.Order;
import com.example.demo.Mid.project.Service.Imp.onlineBookImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/books")
@org.springframework.stereotype.Controller
@RestController

public class BookController {

    @Autowired
    private onlineBookImp online;


    @PostMapping("/Admin/addBook")
    public Book addbook(@RequestBody Book book) {
        return online.addbook(book);
    }


    @PostMapping("/add/customer")
    public Customer addcustomer(@RequestBody Customer customer) {
        return online.addcustomer(customer);
    }


    @PostMapping("/add/Admin")
    public Admin addadmin(@RequestBody Admin admin) {
        return online.addadmin(admin);
    }


    @PostMapping("/customer/addOrder/{orderId}/{customerId}")
    public Order addorder(@RequestBody Order order) {
        return online.addorder(order);

    }


    @GetMapping("/Allbook")
    public List<Book> getBook() {
        return online.getAllBook();

    }

   @GetMapping("/{title}")
  public Book getBookByTitle(@PathVariable String title) {
      return online.getBookbytitle(title);
       }
    @PutMapping("/updetbook")
    public Book updetbook(@RequestBody Book book){
     return online.updat(book);
}

@DeleteMapping("/deleteBook/{id}")
    public String deletbook(@PathVariable Long id){
        return online.deletbook(id);
}


}






