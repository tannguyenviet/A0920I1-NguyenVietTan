package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAllEmployee(Pageable pageable);
    Employee findEmployeeById(String id);
    void saveEmployee(Employee employee);
    void deleteEmployeeById(String id);
    Page<Employee> findEmployeesByTypeEmployeeId(String id,String key_search,Pageable pageable);
}
