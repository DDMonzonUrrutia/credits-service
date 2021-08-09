package com.everis.creditservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "productCredit")
public @Data class ProductCredit {
	@Id
	private String id;
	private String description;
	private double interest;
	private TypeProductCredit typeProductCredit;
	private Integer code;
	public ProductCredit(String description, double interest, TypeProductCredit typeProductCredit, Integer code) {
		super();
		this.description = description;
		this.interest = interest;
		this.typeProductCredit = typeProductCredit;
		this.code = code;
	}
} 
