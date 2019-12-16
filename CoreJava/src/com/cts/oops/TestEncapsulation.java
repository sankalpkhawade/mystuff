package com.cts.oops;

class Employee{
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private long mobileNumber;
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
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}

public class TestEncapsulation {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.setEmployeeId(1122);
		e.setEmployeeName("James");
		e.setSalary(500000.00);
		e.setMobileNumber(9845781212L);
		e.setEmailId("james@gmail.com");
		
		System.out.println("Employee Id : "+e.getEmployeeId());
		System.out.println("Employee NAme : "+e.getEmployeeName());
		System.out.println("Employee Salary : "+e.getSalary());
		System.out.println("Employee Mobile Number : "+e.getMobileNumber());
		System.out.println("Employee Email Id : "+e.getEmailId());
		
	}

}
