package com.everis.creditservice.services;

import com.everis.creditservice.domain.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono; 	
public interface TypeCreditService {

	Mono<TypeProductCredit> save(TypeProductCredit typeProductCredit);
	


	Flux<TypeProductCredit> findAll();

	Mono<TypeProductCredit> findById(String id);

	Mono<Void> deletexId(String id);

	Mono<Void> delete(TypeProductCredit typeProductCredit);
}
