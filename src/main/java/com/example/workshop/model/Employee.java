package com.example.workshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  
public class Employee {
	   @Id
        Integer id;
        public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		String name;
}
