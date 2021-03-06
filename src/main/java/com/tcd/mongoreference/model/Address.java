package com.tcd.mongoreference.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Setter
@Getter
public class Address {
	
	
	private String line1;
	private String line2;
	private int zipcode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String line1, String line2, int zipcode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.zipcode = zipcode;
	}

	
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", zipcode=" + zipcode + "]";
	}
	
	
	

}
