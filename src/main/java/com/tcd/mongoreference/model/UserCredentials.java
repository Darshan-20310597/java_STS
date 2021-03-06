package com.tcd.mongoreference.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
@NoArgsConstructor
public class UserCredentials {
	
	@Id
	private String id;
	private String userName;
	private String password;
	@Indexed(unique = true)
	private String email;
	
	public UserCredentials( String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
}
