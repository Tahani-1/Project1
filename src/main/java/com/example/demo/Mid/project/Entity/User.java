package com.example.demo.Mid.project.Entity;

import jakarta.persistence.*;

@Entity
@Table (name ="Usre")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String UserName;
    private String UserEmail;

    public User() {

    }

    public User(long ID, String userName, String userEmail) {
        this.ID = ID;
        UserName = userName;
        UserEmail = userEmail;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }
}