package com.example.demo.Mid.project.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Book")

public class Book {

    @ManyToOne
    private   Order order;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String Author;
    private String title;
    private  int quantity;
    private  double price;
    private int YearPulblication;
    @ManyToOne
    private Admin admin;

    public Book() {
    }

    public Book(long ID, String author, String title, int quantity, double price, int yearPulblication) {
        this.ID = ID;
        Author = author;
        title = title;
        this.quantity = quantity;
        this.price = price;
        YearPulblication = yearPulblication;
    }

    public Book(double i, String author, String title, double price, int yearPulblication) {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearPulblication() {
        return YearPulblication;
    }

    public void setYearPulblication(int yearPulblication) {
        YearPulblication = yearPulblication;
    }

    @Override
    public String  toString() {
        return "Book{" +
                "ID=" + ID +
                ", Author='" + Author + '\'' +
                ", Title='" + title + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", YearPulblication=" + YearPulblication +
                '}';
    }


}
