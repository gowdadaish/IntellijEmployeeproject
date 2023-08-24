package com.example.Employee.Controller;

import com.example.Employee.Model.Employee;
import com.example.Employee.Service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/add-emp")
    public Employee addEmployee(@RequestBody Employee employee){
       return employeeServiceImpl.addEmployeeDetails(employee);
    }


}
