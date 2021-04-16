package service;

import model.Customer;

import java.util.List;

public interface CustomerSevice {
    Customer findCustomerById(String id);
    List<Customer> findAll();
    void CreateNewCustomer(Customer customer);
    void DeleteCustomer(String id);
    void UpdateCustomer(Customer customer);
}
