package com.tcd.mongoreference.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ExecutableFindOperation.ExecutableFind;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.tcd.mongoreference.model.UserCredentials;
import com.tcd.mongoreference.repository.LoginRepo;

@Service
public class LoginService {

	
	@Autowired
	LoginRepo loginrepo;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public String upsert(UserCredentials creds) {
		String emailresponse =null;
		//String emails = new String (creds.getEmail());
		String emails = new String (creds.getEmail());
		System.out.println(emails);
		Query query = new Query();
		query.addCriteria(Criteria.where("email").in(emails));
		System.out.println(query);
		boolean postExistsAlready = mongoTemplate.exists(query, UserCredentials.class);
		//return loginrepo.save(creds);
		System.out.println(postExistsAlready);
		
		if(!postExistsAlready) {
			loginrepo.save(creds);
			//mongoTemplate.save(creds, "UserCrendtials");
	        System.out.println("Posted!!!");
	        emailresponse = "Success ";
	    }
	    else {
	    	emailresponse = "Failed";
	        System.out.println("Post Already Exists!!!");
	    }
//		UserCredentials users = loginrepo.save(creds);
//		
//		if(users.equals(null)) {
//			emailresponse = "Not updated";
//		}else {
//			emailresponse = "Success";
//		}
		
		return emailresponse;
	}

}
