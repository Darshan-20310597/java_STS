package com.tcd.mongoreference;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcd.mongoreference.model.Address;
import com.tcd.mongoreference.model.Employee;
import com.tcd.mongoreference.repository.Repo;

@SpringBootApplication
public class MongoReferenceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MongoReferenceApplication.class, args);
	}

	@Autowired
	Repo repo;
	
	// Initial Loading of Databases
	@Override
	public void run(String... args) throws Exception {
		
		List<Employee> listofEmployee = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Ranjan", new Address("BSK","India",1234),11224.00);
		Employee e2 = new Employee("Darshan", new Address("BSK1","India",1234),1122.00);
		Employee e3 = new Employee("Ravu", new Address("BSK2","India",1234),11224.00);
		Employee e4 = new Employee("Chiru", new Address("BSK3","Ireland",1234),114.00);
		Employee e5 = new Employee("Hitesh", new Address("BSK4","Ireland",1234),1224.00);
		Employee e6 = new Employee("Karthik", new Address("BSK5","Dublin",1234),58224.00);
		Employee e7 = new Employee("Rajesh", new Address("BSK5","Dublin",1234),9987.00);
		
		
		listofEmployee.add(e1);
		listofEmployee.add(e2);
		listofEmployee.add(e3);
		listofEmployee.add(e4);
		listofEmployee.add(e5);
		listofEmployee.add(e6);
		listofEmployee.add(e7);
		
		
		repo.insert(listofEmployee);
		
		
	}

}
