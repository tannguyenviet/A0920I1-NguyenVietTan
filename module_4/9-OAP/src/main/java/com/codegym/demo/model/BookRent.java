package com.codegym.demo.model;

import javax.persistence.*;

@Entity
public class BookRent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_bookRent;
    @Column(unique = true)
    private int codeRent;
    @ManyToOne(targetEntity = Book.class)
    private Book book;

    public BookRent() {
    }

    public BookRent(int id_bookRent, int codeRent, Book book) {
        this.id_bookRent = id_bookRent;
        this.codeRent = codeRent;
        this.book = book;
    }

    public int getId_bookRent() {
        return id_bookRent;
    }

    public void setId_bookRent(int id_bookRent) {
        this.id_bookRent = id_bookRent;
    }

    public int getCodeRent() {
        return codeRent;
    }

    public void setCodeRent(int codeRent) {
        this.codeRent = codeRent;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
