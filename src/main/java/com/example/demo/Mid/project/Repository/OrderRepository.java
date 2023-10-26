package com.example.demo.Mid.project.Repository;

import com.example.demo.Mid.project.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends JpaRepository<Order , Long> {


}
