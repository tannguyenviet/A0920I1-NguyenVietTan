package service;

import controller.CustomerServlet;
import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerSevice {
    private  CustomerDAO customerDAO = new CustomerDAOImpl();
    @Override
    public Customer findCustomerById(String id) {
        return customerDAO.selectCustomerById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerDAO.selectAllCustomer();
    }

    @Override
    public void CreateNewCustomer(Customer customer) {
        customerDAO.insertCustomer(customer);
    }

    @Override
    public void DeleteCustomer(String id) {
        customerDAO.deleteCustomer(id);
    }

    @Override
    public void UpdateCustomer(Customer customer) {
        customerDAO.updateCustomer(customer);
    }
}
