package com.example.demo.Mid.project.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    @OneToOne
    private Book book;
    @OneToOne
    private Customer customer;
    private  int quantityofOrder;

    public Order(int quantityofOrder) {
        this.quantityofOrder = quantityofOrder;
    }

    public int getQuantityofOrder() {
        return quantityofOrder;
    }

    public void setQuantityofOrder(int quantityofOrder) {
        this.quantityofOrder = quantityofOrder;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return ID == order.ID && Objects.equals(book, order.book) && Objects.equals(customer, order.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, book, customer);
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", book=" + book +
                ", customer=" + customer +
                '}';
    }

    public Order(long ID, Book book, Customer customer) {
        this.ID = ID;
        this.book = book;
        this.customer = customer;
    }

    public Order() {
    }
}
