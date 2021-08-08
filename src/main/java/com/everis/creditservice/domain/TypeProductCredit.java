package com.everis.creditservice.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "typeAcctCredit")
public @Data class TypeProductCredit {
	@Id
	private String id;
	private String description;
	private int valtip;
	
	
}
