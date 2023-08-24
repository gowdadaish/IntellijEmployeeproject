package com.example.Employee.Service.impl;

import com.example.Employee.Model.Employee;
import com.example.Employee.Repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class EmployeeServiceImpl {
    @Autowired
     EmployeeRepository employeeRepository;

    public Employee addEmployeeDetails(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }


}
