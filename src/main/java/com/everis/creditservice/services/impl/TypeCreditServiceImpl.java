package com.everis.creditservice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.everis.creditservice.domain.*;
import com.everis.creditservice.repository.*;
import com.everis.creditservice.services.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class TypeCreditServiceImpl implements TypeCreditService{

	
	@Autowired
	TypeCreditRepository typeProductRepo;

	@Override
	public Mono<TypeProductCredit> save(TypeProductCredit typeProductCredit) {
		return typeProductRepo.save(typeProductCredit);
	}

	@Override
	public Flux<TypeProductCredit> findAll() {
		return typeProductRepo.findAll();
	}

	@Override
	public Mono<TypeProductCredit> findById(String id) {
		return typeProductRepo.findById(id) ;
	}

	@Override
	public Mono<Void> deletexId(String id) {
	return typeProductRepo.deleteById(id);
	}

	@Override
	public Mono<Void> delete(TypeProductCredit typeProductCredit) {
		return typeProductRepo.delete(typeProductCredit);
	}
	


}