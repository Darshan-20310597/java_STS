package com.tcd.mongoreference.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcd.mongoreference.model.Employee;
import com.tcd.mongoreference.repository.Repo;

@Service
public class EmpService {

	@Autowired
	Repo repo;

	public List<Employee> getAll() {
		return repo.findAll();
	}
	
}
