package com.example.demo.Mid.project.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer extends User {
    @Id

    private long ID;



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



