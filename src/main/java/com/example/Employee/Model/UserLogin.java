package com.example.Employee.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name= "user-login")
public class UserLogin {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private long id;

        @Column(name = "emp",nullable = false)
        private String FirstName;
        private String email;
        private String password;
        private boolean enabled;
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "employee_id")
        private Employee employee;

    }
