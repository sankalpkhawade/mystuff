package com.cts;
import java.util.*;

class Employee2{
	int employeeId;
	String employeeName;
	double salary;
	
	public Employee2(int employeeId, String employeeName, double salary) {
		// TODO Auto-generated constructor stub
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}

	public void displayArr(){
	System.out.println("Employee Id : "+employeeId);
	System.out.println("Employee Name : "+employeeName);
	System.out.println("Salary : "+salary);
	}
	
}

public class Arr{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int employeeId;
		String employeeName;
		double salary;
		Employee2 e[]=new Employee2[3];
		e[0]=new Employee2(1122,"james",1200.00);
		e[0].displayArr();
		e[0]=new Employee2(1123,"james1",1500.00);
		e[0].displayArr();
		e[0]=new Employee2(1124,"james2",1700.00);
		e[0].displayArr();
	}

}
