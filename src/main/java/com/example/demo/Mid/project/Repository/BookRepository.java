package com.example.demo.Mid.project.Repository;

import com.example.demo.Mid.project.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository <Book,Long> {


    Book findByTitle(String title);

}
