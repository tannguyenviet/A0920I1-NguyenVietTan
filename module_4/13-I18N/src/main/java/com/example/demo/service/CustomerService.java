package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(int id) throws Exception;

    void save(Customer customer);

    void remove(int id);

    void update(Customer customer);
}