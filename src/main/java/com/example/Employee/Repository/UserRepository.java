package com.example.Employee.Repository;

import com.example.Employee.Model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserLogin, Long> {
}

