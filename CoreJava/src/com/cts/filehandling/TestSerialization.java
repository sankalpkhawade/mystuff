package com.cts.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee3 implements Serializable{
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private long mobileNumber;
	private String emailId;
	transient private String password;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

public class TestSerialization {

	public static void main(String[] args) throws IOException {
		
		Employee3 e=new Employee3();
		e.setEmployeeId(1);
		e.setEmployeeName("James");
		e.setSalary(5200.00);
		e.setMobileNumber(7546985612L);
		e.setEmailId("james@gmail.com");
		e.setPassword("java");
		
		FileOutputStream fo=new FileOutputStream("employee.txt");
		ObjectOutputStream ooStream=new ObjectOutputStream(fo);
		ooStream.writeObject(e);
		System.out.println("Object has been successfully serializable.");
		fo.close();
	}

}
