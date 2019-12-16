package com.cts.model;

import java.sql.Date;

public class Employee {

	private int employeeId;
	private String name;
	private Date date_of_birth;
	private int salary;

	public Employee(String name, Date date, int salary) {
		this.name=name;
		this.date_of_birth=date;
		this.salary=salary;
	}

	public Employee() {
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		 this.date_of_birth = date_of_birth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
