package com.everis.creditservice.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "typeProductCredit")
public @Data class TypeProductCredit {
	@Id
	private String id;
	private String description;
	private int valtip;
	
	public TypeProductCredit(String description, int valtip) {
		super();
		this.setDescription(description);
		this.setValtip(valtip);
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getValtip() {
		return valtip;
	}

	public void setValtip(int valtip) {
		this.valtip = valtip;
	}
}
