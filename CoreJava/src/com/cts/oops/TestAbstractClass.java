package com.cts.oops;

abstract class Employee3{
	
	private int employeeId;
	private String employeeName;
	//abstract method should be written in abstract class only -------->
	public abstract void employeeInfo1();
	
	public void employeeInfo2(){
		
		System.out.println("Non abstract class");
	}
	
	//Abstract class Constructor  ---------------->
	public Employee3(){
		
		System.out.println("Default Constructor for abstract class");
	}
	
	public Employee3(int employeeId,String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	
	public void employeeInfo3(){
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
	}
}

class Manager3 extends Employee3{
	
	public Manager3(){
		System.out.println("Default constructor for child class");
	}
	
	public void employeeInfo1(){
		
		System.out.println("Abstract Method");
		
	}
}

public class TestAbstractClass {

	public static void main(String[] args) {
		
		Manager3 m3=new Manager3();
		m3.employeeInfo1();
		m3.employeeInfo2();
		
		//Anonymous Class ------->
		Employee3 e=new Employee3(1122,"James"){
			
			public void employeeInfo1(){
				
				System.out.println("Anonymous Class");
			}
		};
		e.employeeInfo1();
		e.employeeInfo3();
	}

}
