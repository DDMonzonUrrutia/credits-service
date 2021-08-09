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


@RequestMapping("/credit-types")
@RestController
public class TypeCreditController {
	
	@Autowired
	private  TypeCreditService typeCreditService;

	@GetMapping("/list")
	public Flux<TypeProductCredit> findAll() {
		return typeCreditService.findAll();
	}

	@GetMapping("/{id}")
	public Mono<TypeProductCredit> finById(@PathVariable String id) {
		return typeCreditService.findById(id);
	}

	@PostMapping
	public Mono<TypeProductCredit> save(@RequestBody TypeProductCredit typeProductCredit) {
		return typeCreditService.save(typeProductCredit);
	}

	@PutMapping
	public Mono<TypeProductCredit> update(@RequestBody TypeProductCredit typeProductCredit) {
		return typeCreditService.save(typeProductCredit);
	}

	@DeleteMapping("/{id}")
	public Mono<Void> deleteProductType(@PathVariable String id){
		return typeCreditService.deleteById(id);
	}

}