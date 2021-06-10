package com.szachyonline.szachyonlinedemo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepository extends MongoRepository<User, String>{
	/*
	 * 
	 * MongoRepo gives some methods such as insert, update, delete
	 * In case we need some more methods we can insert them here
	 * public void createUser(User User); 
	public User getUserByHisID(String id); 
	public List<User> getAllUsers();
	public void updateEmployee(User user); 
	public void deleteEmployee(String id); 
	*/
}
