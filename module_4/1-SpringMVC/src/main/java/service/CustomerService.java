package service;

import bean.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public List<Customer> getListCustomer(){
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("1","Tan",3));
        customerList.add(new Customer("2","Tuan",3));
        customerList.add(new Customer("3","Minh",4));
        return customerList;

    }
}
