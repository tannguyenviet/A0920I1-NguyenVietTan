package service;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
    @Override
    public Employee findEmployeeById(String id) {
        return employeeDAO.selectEmployeeById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.selectAllEmployee();
    }

    @Override
    public void CreateNewEmployee(Employee employee) {
        employeeDAO.insertEmployee(employee);
    }

    @Override
    public void DeleteEmployee(String id) {
        employeeDAO.deleteEmployee(id);
    }

    @Override
    public void UpdateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }
}
