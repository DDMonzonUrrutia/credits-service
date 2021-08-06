package com.everis.creditservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import reactor.core.publisher.Flux;



import com.everis.creditservice.domain.*;
import com.everis.creditservice.repository.*;

@SpringBootApplication
public class CreditserviceApplication  implements CommandLineRunner {


	
	
	@Autowired
	private ProductCreditRepository productbank;

	@Autowired
	private TypeCreditRepository typeprodcredt;
	
	@Autowired
	private ReactiveMongoTemplate template;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CreditserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.dropCollection(ProductCredit.class).subscribe();
		template.dropCollection(TypeProductCredit.class).subscribe();
	
		
		TypeProductCredit type = new TypeProductCredit();
		
	
		type.setdescription("Credito");

		Flux.just(type)
		.flatMap(tipP -> typeprodcredt.save(tipP))
		.thenMany(	
				Flux.just(new ProductCredit("Cuenta de credito personal" ,0.00,  type,1),
						  new ProductCredit("Cuenta de credito empresarial" ,0.00,  type,2),
						  new ProductCredit("Tarjeta de credito" ,0.00,  type,3) ,
						  new ProductCredit("Adelanto de efectivo " ,0.00,  type,4) 
					)	
				).flatMap(pro -> productbank.save(pro))
		.subscribe(res -> System.out.println("Producto".concat(res.toString().concat(" " + "Registrado"))));
		
		
		
		
	}
}
