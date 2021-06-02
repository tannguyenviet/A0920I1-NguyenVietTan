package com.codegym.demo.service;

import com.codegym.demo.exception.DuplicateEmailException;
import com.codegym.demo.model.Customer;

import java.util.List;

public interface CustomerService{
    List<Customer> findAll();

    Customer findById(int id) throws Exception;

    void save(Customer customer) throws DuplicateEmailException;

    void remove(int id);

    void update(Customer customer);
}