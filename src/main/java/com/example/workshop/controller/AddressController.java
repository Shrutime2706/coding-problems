package com.example.workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshop.model.Address;
import com.example.workshop.model.Employee;
import com.example.workshop.repositary.AddressRepositary;
import com.example.workshop.repositary.EmployeeRepositary;

@RestController
public class AddressController {

		@Autowired
		AddressRepositary addressrepositary;
		
		@PostMapping("/save")
		void save (@RequestBody  Address  address)
		{
			addressrepositary.save(address);
		}
		
	    @GetMapping("/get")
		List<Address> get()
		{
			return addressrepositary.findAll();
			
		}
}
