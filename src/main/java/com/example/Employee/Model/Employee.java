package com.example.Employee.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

import java.util.ArrayList;

@Entity
@Data
@Table(name="EmployeeDetails")
public class Employee {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "employee_id")
        private String id;


        @Column(name = "first-name")
        private String firstName;
        @Column(name="lastname")
        private String lastName;
        private String email;
        private String password;
        @OneToOne(mappedBy = "employee")
        private UserLogin userLogin;






}
