package com.tcd.mongoreference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.diagnostics.logging.Logger;
import com.tcd.mongoreference.Service.LoginService;
import com.tcd.mongoreference.model.UserCredentials;
import java.io.*;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class LoginController {
	
	
	@Autowired
	LoginService loginservice;
	
	@PostMapping("/")
	public ResponseEntity<String> upsert(@RequestBody UserCredentials creds) throws Exception {
		boolean response = true;
		//String output_msg = null;
		
			String output_msg = loginservice.upsert(creds);
			System.out.println(output_msg);
			String success = "Success";
			System.out.println(output_msg.equals(success));
			if (!output_msg.equals(success))
			{
				response = true;
			}
			else {
				response = false;
			}
			if(response) {
				output_msg = "User updated Successfully";
			}
			else {
				output_msg = "User exists";
			}
	
		System.out.println(output_msg);
		System.out.println(response);
		return new ResponseEntity<>(output_msg, HttpStatus.CREATED);
	}

}
