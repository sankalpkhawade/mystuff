package com.cts.core;

public class Employee1 {

	private int employeeId;
	private String employeeName;
	private String username;
	private String password;

	public Employee1(int employeeId, String employeeName, String username, String password) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.username = username;
		this.password = password;

	}

	public void emploloyeeInfo() {

		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Username: " + username);
		System.out.println("Employee Password: " + password);

	}

}
