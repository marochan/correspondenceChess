package com.szachyonline.szachyonlinedemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.szachyonline.szachyonlinedemo")
public class MongoConfig extends AbstractReactiveMongoConfiguration{
	
	@Override
	public String getDatabaseName() {
		return "ChessGameDB";
	}
	@Override
	@Bean
	public MongoClient mongoClient() {
		ServerAddress address = new ServerAddress("127.0.0.1", 27017);
		MongoCredential credential = MongoCredential.createCredential("mdbUser", getDatabaseName(), "cp".toCharArray());
		MongoClientOptions options = new MongoClientOptions.Builder().build();
        
		MongoClient client = new MongoClient(address, credential, options);
		return client;
	}
}

