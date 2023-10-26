package com.example.demo.Mid.project.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Getter
//@Setter
@Table(name = "customers")
public class Customer extends User {


@OneToOne
private Order order;


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer() {
    }

    public Customer(Long id, String userName, String userEmail, String role) {
        super(id, userName, userEmail, role);
    }
}





















//    public Customer(String name, String email) {
//        super(name, email);
//    }
//
//
//    @Override
//    public String getName() {
//        return super.getName();
//    }
//
//    @Override
//   public String getEmail(){
//        return super.getEmail();
//    }
//    public String setName(){



