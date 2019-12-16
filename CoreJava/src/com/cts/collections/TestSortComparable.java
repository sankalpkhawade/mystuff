package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Object>{

	private int employeeId;
	private String employeeName;
	private double salary;
	private String emailId;
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public int compareTo(Object o) {
		
		Employee1 e=(Employee1) o;
		
		if(this.salary>e.getSalary())
			return 1;
		if(this.salary<e.getSalary())
			return -1;
		
		return 0;
	}
	
}

public class TestSortComparable {

	public static void main(String[] args) {
		
		Employee1 e1=new Employee1();
		Employee1 e2=new Employee1();
		Employee1 e3=new Employee1();
		
		e1.setEmployeeId(1);
		e1.setEmployeeName("James");
		e1.setSalary(52000.00);
		e1.setEmailId("james@gmail.com");
		
		e2.setEmployeeId(2);
		e2.setEmployeeName("Surya");
		e2.setSalary(50000.00);
		e2.setEmailId("surya@gmail.com");
		
		e3.setEmployeeId(3);
		e3.setEmployeeName("Ashwant");
		e3.setSalary(55000.00);
		e3.setEmailId("ashwant@gmail.com");
		
		ArrayList<Employee1> employeeList=new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		
		for(Employee1 e:employeeList){
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getSalary()+"\t"+e.getEmailId());
		}
		System.out.println("\nAfter Sorting --------------------->\n");
		Collections.sort(employeeList);
		for(Employee1 e:employeeList){
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getSalary()+"\t"+e.getEmailId());
		}
	}

}
