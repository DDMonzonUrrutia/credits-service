package com.everis.creditservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import reactor.core.publisher.Flux;



import com.everis.creditservice.domain.*;
import com.everis.creditservice.repository.*;



@EnableReactiveMongoRepositories
@SpringBootApplication
public class CreditserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditserviceApplication.class, args);
	}

	
}
