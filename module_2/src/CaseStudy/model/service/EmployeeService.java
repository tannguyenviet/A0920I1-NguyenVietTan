package CaseStudy.model.service;

import CaseStudy.model.entity.Customer;
import CaseStudy.model.entity.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private ReadWriteFile readWriteFile;
    public EmployeeService(){
        readWriteFile = new ReadWriteFile();
    }
    public List<Employee> getAllEmployee() throws IOException {
        String[] employeeListLine;
        List<Employee> employeeList = new ArrayList<>();
        employeeListLine = readWriteFile.readFile("./src/CaseStudy/data/Employee.csv").split("\n");
        for (String s : employeeListLine) {
            String[] propertiesCustomer = s.split(",");
            employeeList.add(new Employee(Integer.parseInt(propertiesCustomer[0]), propertiesCustomer[1], Integer.parseInt(propertiesCustomer[2]), propertiesCustomer[3]));
        }
        return employeeList;
    };
    public Employee getEmployeeByID(int i) throws IOException {
        List<Employee> employeeList = getAllEmployee();
        return employeeList.get(i);
    }
}
