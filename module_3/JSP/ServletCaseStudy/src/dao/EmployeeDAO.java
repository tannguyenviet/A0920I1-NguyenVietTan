package dao;

import model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> selectAllEmployee();
    Employee selectEmployeeById(String id);
    void deleteEmployee(String id);
    void updateEmployee(Employee employee);
    void insertEmployee(Employee employee);
}
