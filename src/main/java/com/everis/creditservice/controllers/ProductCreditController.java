package com.everis.creditservice.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.creditservice.domain.*;
import com.everis.creditservice.services.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/product-credits")
@RestController
public class ProductCreditController {
	
	@Autowired
	private  ProductCreditService productCreditService;

	@GetMapping("/list")
	public Flux<ProductCredit> findAll() {
		return productCreditService.findAll();
	}

	@GetMapping("/{id}")
	public Mono<ProductCredit> finById(@PathVariable String id) {
		return productCreditService.findById(id);
	}

	@PostMapping
	public Mono<ProductCredit> save(@RequestBody ProductCredit productCredit) {
		return productCreditService.save(productCredit);
	}

	@PutMapping
	public Mono<ProductCredit> update(@RequestBody ProductCredit productCredit) {
		return productCreditService.save(productCredit);
	}

	@DeleteMapping("/{id}")
	public Mono<Void> deleteProduct(@PathVariable String id){
		return productCreditService.deleteById(id);
	}

}