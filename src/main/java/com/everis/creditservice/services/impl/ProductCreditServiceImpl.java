package com.everis.creditservice.services.impl;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.everis.creditservice.domain.*;
import com.everis.creditservice.repository.*;
import com.everis.creditservice.services.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class ProductCreditServiceImpl implements ProductCreditService{

	
	
	@Autowired
	private ProductCreditRepository prodcredRepo;
	
	@Override
	public Mono<ProductCredit> save(ProductCredit productCredit) {
		return this.prodcredRepo.save(productCredit);
	
	}

	@Override
	public Flux<ProductCredit> findAll() {
		return this.prodcredRepo.findAll();
	}

	@Override
	public Mono<ProductCredit> findById(String id) {
		return this.prodcredRepo.findById(id);
	}
 
	@Override
	public Mono<Void> deletexId(String id) {
		return this.prodcredRepo.deleteById(id);
	}

	@Override
	public Mono<Void> delete(ProductCredit productCredit) {
		return this.prodcredRepo.delete(productCredit);
	}


}