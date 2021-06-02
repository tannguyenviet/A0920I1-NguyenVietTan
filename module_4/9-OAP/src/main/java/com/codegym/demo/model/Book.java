package com.codegym.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @NotNull
    private int quantity;
    private String author;
    @OneToMany(mappedBy = "book",cascade =CascadeType.ALL)
    private List<BookRent> bookRents;

    public Book() {
    }

    public Book(int id, String name, @NotNull int quantity, String author, List<BookRent> bookRents) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.author = author;
        this.bookRents = bookRents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public List<BookRent> getBookRent() {
        return bookRents;
    }

    public void setBookRent(List<BookRent> bookRents) {
        this.bookRents = bookRents;
    }
}
