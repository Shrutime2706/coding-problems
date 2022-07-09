package com.example.workshop.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.workshop.model.Employee;


@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Integer>{
// java persistence api
}
