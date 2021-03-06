package com.tcd.mongoreference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcd.mongoreference.Service.EmpService;
import com.tcd.mongoreference.model.Employee;

@RestController
@RequestMapping("/mongo")
public class Controller {
	
	
	@Autowired
	EmpService empservice;
	
	
	@GetMapping("/")
	public List<Employee> getAll(){
		return empservice.getAll();
	}
	
	
}
