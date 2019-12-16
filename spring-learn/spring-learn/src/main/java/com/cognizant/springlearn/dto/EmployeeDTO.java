package com.cognizant.springlearn.dto;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.cognizant.springlearn.bean.Department;
import com.cognizant.springlearn.bean.Employee;
import com.cognizant.springlearn.bean.Skill;
import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeDTO {
	
	@NotNull(message = "Id should be a number")
	private int id;
	
	@Size(min = 1, max = 30, message = "Name should not be blank")
	@NotNull
	private String name;
	
	private double salary;

	@NotNull
	private boolean permanent;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dateOfBirth;
	
	private DepartmentDTO departmentDTO;
	
	private Set<SkillDTO> skillDTOList;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public DepartmentDTO getDepartmentDTO() {
		return departmentDTO;
	}

	public void setDepartmentDTO(DepartmentDTO departmentDTO) {
		this.departmentDTO = departmentDTO;
	}

	public Set<SkillDTO> getSkillDTOList() {
		return skillDTOList;
	}

	public void setSkillDTOList(Set<SkillDTO> skillDTOList) {
		this.skillDTOList = skillDTOList;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateOfBirth=" + dateOfBirth + ", departmentDTO=" + departmentDTO + ", skillDTOList=" + skillDTOList
				+ "]";
	}

	
}
