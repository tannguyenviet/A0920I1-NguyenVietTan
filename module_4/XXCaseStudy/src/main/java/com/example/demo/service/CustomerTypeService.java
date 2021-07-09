package com.example.demo.service;

import com.example.demo.model.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerTypeService {
    Page<CustomerType> findAllCustomerType(Pageable pageable);
    List<CustomerType> findAllListCustomerType();
    CustomerType findCustomerTypeById(String id);
    void saveCustomerType(CustomerType customerType);
    void deleteCustomerTypeById(String id);
}
