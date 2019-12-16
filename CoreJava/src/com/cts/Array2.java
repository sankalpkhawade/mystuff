package com.cts;
import java.util.*;

class Employee3{
	int employeeId;
	String employeeName;
	double salary;
	
	public Employee3(int employeeId, String employeeName, double salary) {
		// TODO Auto-generated constructor stub
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}

	public void displayArr(){
	
	System.out.println("\nEmployee Id   : "+employeeId);
	System.out.println("Employee Name : "+employeeName);
	System.out.println("Salary        : "+salary);
	
	}
	
}

public class Array2 {
	private static Scanner a;

	public static void main(String[] args) {
		a = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=a.nextInt();
		int employeeId[]=new int[n];
		String[] employeeName=new String[n];
		double salary[]=new double[n];
		Employee3 e[]=new Employee3[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee Id : ");
			employeeId[i]=a.nextInt();
			System.out.println("Enter Employee Name of "+employeeId[i]+" : ");
			employeeName[i]=a.next();
			System.out.println("Enter Employee Salary of "+employeeId[i]+" : ");
			salary[i]=a.nextDouble();
		}
		System.out.println("\n**************************");
		System.out.println("     Employee Details     ");
		System.out.println("**************************");
		for(int i=0;i<n;i++)
		{	
			e[i]=new Employee3(employeeId[i],employeeName[i],salary[i]);
			e[i].displayArr();
			System.out.println("-------------------------");
		}
	}

}
