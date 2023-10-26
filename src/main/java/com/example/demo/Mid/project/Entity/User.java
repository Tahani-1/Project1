package com.example.demo.Mid.project.Entity;
//import com.example.demo.Mid.project.Entity.Role;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Role;

import java.util.Objects;


@Entity
@Setter
@Getter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String userName;
    private String userEmail;
    private String role;

    public User() {
    }

    public User(Long id, String userName, String userEmail, String role) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName) && Objects.equals(userEmail, user.userEmail) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userEmail, role);
    }
}
