package com.example.demo.Mid.project.Service.inter;

import com.example.demo.Mid.project.Entity.Book;
import com.example.demo.Mid.project.Entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface onlineBookInter{

public Order addorder(Order order);



    public Book addbook(Book book);
public List<Book>getAllbook();
public Book getBookbytitle(String Title);

   public Book updat(Book book);

    String deletbook(Long id);
}
