package com.szachyonline.szachyonlinedemo;

import java.util.Random;

import org.springframework.data.annotation.Id;

public class User {
	@Id
	private String id;
	
	public User(String id) {
		this.id = id;
	}
	
	public String generateUserID() {
		  int leftLimit = 97; // letter 'a'
	        int rightLimit = 122; // letter 'z'
	        int targetStringLength = 10;
	        Random random = new Random();
	        StringBuilder buffer = new StringBuilder(targetStringLength);
	        for (int i = 0; i < targetStringLength; i++) {
	            int randomLimitedInt = leftLimit + (int) 
	            (random.nextFloat() * (rightLimit - leftLimit + 1));
	            buffer.append((char) randomLimitedInt);
	        }
	        String generatedString = buffer.toString();
	        System.out.println(buffer);
	        return generatedString;
	}
	


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
