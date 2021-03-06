package com.tcd.mongoreference.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Setter
@Getter
public class Employee {

	@Id
	private String id;
	private String name;
	private Address address;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Address address, double salary) {
		super();
		
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	
	
	
}
