package com.cognizant.springlearn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@NotNull
	@Size(min = 2, max = 2, message = "Country code should be 2 characters")
	@Column(name = "co_code")
	private String code;

	@Column(name = "co_name")
	private String name;

	// private List<Country> countryList;

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Country() {
		LOGGER.debug("Inside Country Constructor");

	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + "]";
	}

}
