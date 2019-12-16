package com.cts.oops;


class Employee5{

	final int employeeId=1122;
	
	public void employeeInfo1(){
		//employeeId=1123;
		System.out.println("Employee Id : "+employeeId);
	}
}

class Manager5 extends Employee5{
	
	public void employeeInfo1(){
		System.out.println("Child : Manager5");
	}
}

public class TestFinal {

	public static void main(String[] args) {
		
		Employee5 e5=new Employee5();
		e5.employeeInfo1();
	}

}
