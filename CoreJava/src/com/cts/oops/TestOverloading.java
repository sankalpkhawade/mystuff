package com.cts.oops;
import java.util.*;

class Employee2{
	int employeeId;
	String employeeName;
	double salary;
	Date obj;
	
	public int employeeInfo(int employeeId){
		
		System.out.println("Employee Id : "+employeeId);
		return employeeId;
	}
	
	public void employeeInfo(String employeeName,double salary){
		
		System.out.println("Employee Name : "+employeeName);
		System.out.printf("Salary : %.2f",salary);
	}
	
	public Date employeeInfo(Date obj){
		
		System.out.println("\nDate of joining : "+obj);
		return obj;
	}
}

public class TestOverloading {

	public static void main(String args){
		System.out.println("Static args : "+args);
	}
	public static void main(String[] args) {
	
		Employee2 e4=new Employee2();
		e4.employeeInfo(1122);
		e4.employeeInfo("James",500000.00);
		e4.employeeInfo(new Date());
		
		TestOverloading.main("Gosling");
	}

}
