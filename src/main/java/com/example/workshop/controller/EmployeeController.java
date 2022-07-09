package com.example.workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshop.model.Employee;
import com.example.workshop.repositary.EmployeeRepositary;

@RestController
@RequestMapping("/controller")
public class EmployeeController {
	@Autowired
	EmployeeRepositary employeerepositary;
	
	@PostMapping("/save")
	void save(@RequestBody  Employee  employee)
	{
		employeerepositary.save(employee);
	}
	
    @GetMapping("/get")
	List<Employee> get()
	{
		return employeerepositary.findAll();
		
	}
}
