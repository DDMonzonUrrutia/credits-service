package com.everis.creditservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.everis.creditservice.domain.TypeProductCredit;

public interface TypeCreditRepository extends ReactiveMongoRepository<TypeProductCredit, String>{



}
