package dao;

import model.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> selectAllCustomer();
    Customer selectCustomerById(String id);
    void deleteCustomer(String id);
    void updateCustomer(Customer customer);
    void insertCustomer(Customer customer);
}
