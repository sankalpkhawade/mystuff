package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee2{
	
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

}

class SalarySort implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee2 e11=(Employee2) o1;
		Employee2 e22=(Employee2) o2;
		
		if(e11.getSalary()>e22.getSalary())
			return 1;
		if(e11.getSalary()<e22.getSalary())
			return -1;
		return 0;
	}
	
	
}

class NameSort implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee2 e11=(Employee2) o1;
		Employee2 e22=(Employee2) o2;
		
		return e11.getEmployeeName().compareTo(e22.getEmployeeName());
	}
	
}

public class TestSortComparator {

	public static void main(String[] args) {
		
		Employee2 e1=new Employee2();
		Employee2 e2=new Employee2();
		Employee2 e3=new Employee2();
		
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
		
		ArrayList<Employee2> employeeList=new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		
		System.out.println("\nBefore Sorting --------------------->\n");
		for(Employee2 e:employeeList){
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getSalary()+"\t"+e.getEmailId());
		}
		System.out.println("\nAfter Salary Sorting --------------------->\n");
		Collections.sort(employeeList, new SalarySort());
		for(Employee2 e:employeeList){
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getSalary()+"\t"+e.getEmailId());
		}
		
		System.out.println("\nAfter Name Sorting --------------------->\n");
		Collections.sort(employeeList, new NameSort());
		for(Employee2 e:employeeList){
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getSalary()+"\t"+e.getEmailId());
		}
	}

}
