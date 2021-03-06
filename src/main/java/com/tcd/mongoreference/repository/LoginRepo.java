package com.tcd.mongoreference.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.tcd.mongoreference.model.UserCredentials;

public interface LoginRepo extends MongoRepository<UserCredentials, String> {

	//void saveAll(UserCredentials creds); 

	
	
	//String upsert();

}
