package com.cts;
import java.util.*;

class Employee{
//	int idArray[];
//	String nameArray[];
//	double salaryArray[];
	
	public Employee(){
	
//	idArray[0]=1020;
//	idArray[1]=1021;
//	
//	nameArray[0]="james";
//	nameArray[1]="Gosling";
//	
//	salaryArray[0]=34000.00;
//	salaryArray[1]=31000.00;

	}
	
	public void displayArray(int idArray,String nameArray,double salaryArray) {
		// TODO Auto-generated method stub
		System.out.println("------------Id Array----------------");
		System.out.println(idArray);
		System.out.println("------------Name Array--------------");
		System.out.println(nameArray);
		System.out.println("------------Salary Array------------");
		System.out.println(salaryArray);
	}

}

public class Array1 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int idArray[]=new int[50];
		String nameArray[]=new String[50];
		double salaryArray[]=new double[50];
        System.out.println("enter number of elements");
        int n=s.nextInt();
        System.out.println("\nEnter array elements : ");
		for(int i=0;i<n;i++)
		{
			idArray[i]=s.nextInt();
			nameArray[i]=s.next();
			salaryArray[i]=s.nextDouble();
		}
		Employee e1=new Employee();
		for(int i=0;i<n;i++)
		{
			e1.displayArray(idArray[i], nameArray[i], salaryArray[i]); 
		}
	}

} 
