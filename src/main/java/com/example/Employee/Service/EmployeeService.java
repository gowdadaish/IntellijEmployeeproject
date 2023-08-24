package com.example.Employee.Service;

import com.example.Employee.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    public void addEmployeeDetails();
    public List<Employee> getAllEmployeeDetails();

    public Employee getEmployeeById();
    public void deleteEmployee();
}



