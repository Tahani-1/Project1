package com.example.demo.Mid.project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin extends User{
     @Id
   private long ID;


}
