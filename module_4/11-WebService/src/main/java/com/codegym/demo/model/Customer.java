package com.codegym.demo.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String email;

    public String address;

    public Customer() {}

    public Customer(String email, String address) {
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, email, address);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String firstName) {
        this.email = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String lastName) {
        this.address = lastName;
    }
}