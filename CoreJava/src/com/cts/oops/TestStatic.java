package com.cts.oops;

class Employee1{
	
	static int employeeId;
	
	public static void employeeInfo(){
		System.out.println("Employee Id: "+employeeId);
		employeeId++;
	}
	
	public Employee1(){
		System.out.println("----Default Constructor----");
	}
	
	static{
		System.out.println("----Static Block----");
	}
	
	static class Account{
		String username="java";
		String password="java";
		
		public void accountInfo(){
			System.out.println(username+"\t"+password);
		}
	}
}

public class TestStatic {
	static{
		System.out.println("----Static Block2----");
	}
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1();
		e1.employeeInfo();
		
		Employee1 e2=new Employee1();
		e2.employeeInfo();
		
		Employee1 e3=new Employee1();
		e3.employeeInfo();
		
		Employee1.employeeInfo();
		Employee1.employeeInfo();
		
		Employee1 e4=new Employee1();
		e4.employeeInfo();
		
		Employee1.Account ea=new Employee1.Account();
		ea.accountInfo();
	}

}
