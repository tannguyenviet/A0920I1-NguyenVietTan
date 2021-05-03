package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findEmployeeById(String id);
    List<Employee> findAll();
    void CreateNewEmployee(Employee employee);
    void DeleteEmployee(String id);
    void UpdateEmployee(Employee employee);
}
