package com.cognizant.springlearn.dto;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.cognizant.springlearn.bean.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class SkillDTO {

	@NotNull
	@Size(message = "Department Id should be a number")
	private int id;
	
	@NotNull
	@Size(min = 1, max = 30, message = "Department name should not be blank")
	private String name;

	private Set<EmployeeDTO> employeeList;
	
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

	public Set<EmployeeDTO> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Set<EmployeeDTO> employeeList) {
		this.employeeList = employeeList;
	}
	
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}

}
