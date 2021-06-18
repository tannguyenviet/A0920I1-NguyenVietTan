package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAllCustomer(Pageable pageable);
    Customer findCustomerById(String id);
    void saveCustomer(Customer customer);
    void deleteCustomerById(String id);
}
