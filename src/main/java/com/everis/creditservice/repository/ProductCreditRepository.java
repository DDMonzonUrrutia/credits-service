package com.everis.creditservice.repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.everis.creditservice.domain.ProductCredit;
public interface ProductCreditRepository extends ReactiveMongoRepository<ProductCredit, String>{



}
