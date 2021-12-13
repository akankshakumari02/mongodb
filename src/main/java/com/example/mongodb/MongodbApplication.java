package com.example.mongodb;

import com.example.mongodb.repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongodbApplication {
	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

}
