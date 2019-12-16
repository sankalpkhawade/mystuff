package com.cognizant.springlearn.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.springlearn.SpringLearnApplication;

public class Skill {

	@NotNull
	@Size(message = "Department Id should be a number")
	private int id;
	@NotNull
	@Size(min = 1, max = 30, message = "Department name should not be blank")
	private String name;

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public Skill() {
		LOGGER.debug("Skills Constructor");
	}

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

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}

}
