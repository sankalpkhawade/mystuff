package com.cts.controller;

import java.sql.Date;
import java.text.ParseException;
import java.util.Scanner;
import com.cts.dao.EmployeeDAO;
import com.cts.model.Employee;

public class InsertEmployeeBO {

	public static void main(String[] args) throws ParseException {

		Employee employee = new Employee();
		EmployeeDAO employeeDAO = new EmployeeDAO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee details");
		System.out.println("Enter the ID:");
		int employeeId = scanner.nextInt();
		employee.setEmployeeId(employeeId);
		System.out.println("Enter the Name:");
		String name = scanner.next();
		employee.setName(name);
		System.out.println("Enter the Date of birth (dd/MM/yyyy):");
		String dateOne = scanner.next();
		Date date_of_birth = Date.valueOf(dateOne);
		employee.setDate_of_birth(date_of_birth);
		System.out.println("Enter the Salary:");
		int salary = scanner.nextInt();
		employee.setSalary(salary);
		scanner.close();
		employeeDAO.addEmployee(employee);
	}
}
