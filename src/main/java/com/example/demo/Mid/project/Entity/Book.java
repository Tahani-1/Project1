package com.example.demo.Mid.project.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String Author;
    private String Title;
    private  int quantity;
    private  double price;
    private int YearPulblication;

    public Book() {
    }

    public Book(long ID, String author, String title, int quantity, double price, int yearPulblication) {
        this.ID = ID;
        Author = author;
        Title = title;
        this.quantity = quantity;
        this.price = price;
        YearPulblication = yearPulblication;
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
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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
                ", Title='" + Title + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", YearPulblication=" + YearPulblication +
                '}';
    }
}
