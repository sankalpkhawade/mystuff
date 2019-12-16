package com.cognizant.springlearn.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.springlearn.SpringLearnApplication;

public class Department {

	@NotNull
	@Size(message = "Department Id should be a number")
	private int id;
	@NotNull
	@Size(min = 1, max = 30, message = "Department name should not be blank")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	public Department() {
		LOGGER.debug("Department Constructor");
	}

}
