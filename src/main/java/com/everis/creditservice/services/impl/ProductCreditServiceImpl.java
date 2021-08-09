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
	private ProductCreditRepository productCreditRepository;
	
	@Override
	public Mono<ProductCredit> save(ProductCredit productCredit) {
		return this.productCreditRepository.save(productCredit);
	
	}

	@Override
	public Flux<ProductCredit> findAll() {
		return this.productCreditRepository.findAll();
	}

	@Override
	public Mono<ProductCredit> findById(String id) {
		return this.productCreditRepository.findById(id);
	}
 
	@Override
	public Mono<Void> deleteById(String id) {
		return this.productCreditRepository.deleteById(id);
	}

	@Override
	public Mono<Void> delete(ProductCredit productCredit) {
		return this.productCreditRepository.delete(productCredit);
	}


}