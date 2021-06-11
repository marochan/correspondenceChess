package com.szachyonline.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.szachyonline.szachyonlinedemo.UserRepository;
@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoConfig extends AbstractReactiveMongoConfiguration{
	
	@Override
	public String getDatabaseName() {
		return "ChessGameDB";
	}
	@Bean
	public MongoClient mongoClient() {
		
        
		MongoClient client =  MongoClients.create();
		return client;
	}
}

