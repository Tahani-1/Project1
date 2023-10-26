package com.example.demo.Mid.project.Service.Imp;

import com.example.demo.Mid.project.Entity.Admin;
import com.example.demo.Mid.project.Entity.Book;
import com.example.demo.Mid.project.Entity.Customer;
import com.example.demo.Mid.project.Entity.Order;
import com.example.demo.Mid.project.Repository.AdminRepository;
import com.example.demo.Mid.project.Repository.BookRepository;
import com.example.demo.Mid.project.Repository.CustomerRepository;
import com.example.demo.Mid.project.Repository.OrderRepository;
import com.example.demo.Mid.project.Service.inter.onlineBookInter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class onlineBookImp  implements onlineBookInter {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AdminRepository adminRepository;


    public onlineBookImp(com.example.demo.Mid.project.Repository.BookRepository bookRepository) {

    }


    @Override
    @Transactional
    public Order addorder(Order order) {
        try {
            order.setBook(bookRepository.getById(order.getBook().getID()));
            order.setCustomer(customerRepository.getById(order.getCustomer().getId()));
            orderRepository.save(order);

        } catch (Exception e) {
            System.out.println("An error occurred while adding the order: " + e.getMessage());
        }return null;
//    inally {
            // Close the database connection if necessary

    }



    @Override
    public Book addbook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllbook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookbytitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public Book updat(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public String deletbook(Long id) {
        bookRepository.deleteById(id);
        return " Deleted";
    }




    public Customer addcustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Admin addadmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }


}
