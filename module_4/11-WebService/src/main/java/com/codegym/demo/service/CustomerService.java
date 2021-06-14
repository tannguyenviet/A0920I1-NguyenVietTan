package com.codegym.demo.service;

import com.codegym.demo.model.Customer;

import java.util.List;

public interface CustomerService{
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer customer);

    void remove(int id);

    void update(Customer customer);
}