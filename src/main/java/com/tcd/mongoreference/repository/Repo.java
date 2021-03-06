package com.tcd.mongoreference.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tcd.mongoreference.model.Employee;

public interface Repo extends MongoRepository<Employee, String>{
	
	
	
//	Query query = new Query();
//	query.addCriteria(Criteria.where("name").is("Eric"));
//	List<User> users = mongoTemplate.find(query, User.class);
	
//	Query query = new Query();
//	query.addCriteria(Criteria.where("name").regex("^A"));
//	List<User> users = mongoTemplate.find(query,User.class);
	
//	Query query = new Query();
//	query.addCriteria(Criteria.where("age").lt(50).gt(20));
//	List<User> users = mongoTemplate.find(query,User.class);
	
//	Query query = new Query();
//	query.with(Sort.by(Sort.Direction.ASC, "age"));
//	List<User> users = mongoTemplate.find(query,User.class);
	
//	final Pageable pageableRequest = PageRequest.of(0, 2);
//	Query query = new Query();
//	query.with(pageableRequest);
	
	//********************************* Query for Handling Requests individually ***************************//
//	public interface UserRepository 
//	  extends MongoRepository<User, String>, QueryDslPredicateExecutor<User> {
//	    ...
//	}
	//List<User> findByName(String name); it is same as List<User> users = userRepository.findByName("Eric");
	//List<User> findByNameStartingWith(String regexp);
	//List<User> findByNameStartingWith(String regexp);
	//List<User> findByAgeBetween(int ageGT, int ageLT);
//
	
	// *********************** Next method 
	//If we can't represent a query with the help of a method name, or criteria, we can do something more low level – use the @Query annotation.With this annotation, we can specify a raw query – as a Mongo JSON query string.
	

	
	//
//	QPerson person = new QPerson("person");
//	List<Person> result = repository.findAll(person.address.zipCode.eq("C0123"));
	
//	Page<Person> page = repository.findAll(person.lastname.contains("a"), 
//            new PageRequest(0, 2, Direction.ASC, "lastname"));
	
	
//
//	  WriteResult wr = mongoTemplate.updateMulti(new Query(where("accounts.accountType").is(Account.Type.SAVINGS)),
//	                                                            new Update().inc("accounts.$.balance", 50.00),
//	                                                            Account.class);
}
