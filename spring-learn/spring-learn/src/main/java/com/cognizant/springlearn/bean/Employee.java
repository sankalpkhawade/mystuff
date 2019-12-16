//package com.cognizant.springlearn.bean;
//
//import java.util.Arrays;
//import java.util.Date;
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.cognizant.springlearn.SpringLearnApplication;
//import com.fasterxml.jackson.annotation.JsonFormat;
//
//public class Employee {
//
//	@NotNull(message = "Id should be a number")
//	private int id;
//	@NotNull
//	@Size(min = 1, max = 30, message = "Name should not be blank")
//	private String name;
//	@NotNull
//	@Size(min = 0)
//	private double salary;
//	@NotNull
//	private boolean permanent;
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
//	private Date dateOfBirth;
//	private Department department;
//	private Skill[] skill;
//
//	public Skill[] getSkill() {
//		return skill;
//	}
//
//	public void setSkill(Skill[] skill) {
//		this.skill = skill;
//	}
//
//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//
//	public boolean isPermanent() {
//		return permanent;
//	}
//
//	public void setPermanent(boolean permanent) {
//		this.permanent = permanent;
//	}
//
//	public Date getDateOfBirth() {
//		return dateOfBirth;
//	}
//
//	public void setDateOfBirth(Date dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}
//
//	public Employee() {
//		LOGGER.debug("Employee Details : {}");
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
//				+ ", dateOfBirth=" + dateOfBirth + ", department=" + department + ", skill=" + Arrays.toString(skill)
//				+ "]";
//	}
//
//}


package com.cognizant.springlearn.bean;

import java.util.Arrays;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {

                @NotNull
                private int id;
                @NotNull
                @Size(min = 1, max = 30, message = "Name should be 1 to 30 characters")
                private String name;
                @NotNull
                private double salary;
                @NotNull
                private boolean permanent;
                @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
                private Date dateOfBirth;
                private Department department;
                private Skill[] skills;

                public Employee() {
                                // TODO Auto-generated constructor stub
                                System.out.println("Inside Employee Constructor");
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

                public Department getDepartment() {
                                return department;
                }

                public void setDepartment(Department department) {
                                this.department = department;
                }

                public Skill[] getSkills() {
                                return skills;
                }

                public void setSkills(Skill[] skills) {
                                this.skills = skills;
                }

                @Override
                public String toString() {
                                return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
                                                                + ", dateOfBirth=" + dateOfBirth + ", department=" + department + ", skills=" + Arrays.toString(skills)
                                                                + "]";
                }

}
