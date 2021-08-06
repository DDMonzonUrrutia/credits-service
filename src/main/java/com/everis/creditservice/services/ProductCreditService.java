package com.everis.creditservice.services;

import com.everis.creditservice.domain.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public interface ProductCreditService {
	Mono<ProductCredit> save(ProductCredit productCredit);

	Flux<ProductCredit> findAll();

	Mono<ProductCredit> findById(String id);

	Mono<Void> deletexId(String id);

	Mono<Void> delete(ProductCredit productCredit);
}
