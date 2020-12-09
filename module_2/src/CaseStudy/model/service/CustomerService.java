package CaseStudy.model.service;

import CaseStudy.model.entity.Customer;
import CaseStudy.model.entity.Villa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private ReadWriteFile readWriteFile;
    public CustomerService(){
        readWriteFile = new ReadWriteFile();
    }
    public List<Customer> getAllCustomer() throws IOException {
        String[] customerListLine;
        List<Customer> customerList = new ArrayList<>();
        customerListLine = readWriteFile.readFile("./src/CaseStudy/data/Customer.csv").split("\n");
        for(int i =0;i<customerListLine.length;i++){
            String[] propertiesCustomer = customerListLine[i].split(",");
            customerList.add(new Customer(propertiesCustomer[0],propertiesCustomer[1],propertiesCustomer[2],propertiesCustomer[3],propertiesCustomer[4],propertiesCustomer[5],propertiesCustomer[6],propertiesCustomer[7],null));
        }
        return customerList;
    };
    public Customer getCustomerByID(int i) throws IOException {
        List<Customer> customerList = getAllCustomer();
        return customerList.get(i);
    }
}
