package com.example.workshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	

	@Id
	Integer id;
	
	Integer pincode;
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	String streetno;
	String city;
	

}
