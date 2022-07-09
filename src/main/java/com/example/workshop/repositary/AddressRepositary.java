package com.example.workshop.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.workshop.model.Address;

@Repository
public interface AddressRepositary extends JpaRepository<Address, Integer> {
	
	

}