package com.example.demo.Mid.project.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Admin")

public class Admin extends User {

    public Admin() {
    }

    public Admin(Long id, String userName, String userEmail, String role) {
        super(id, userName, userEmail, role);
    }
}
