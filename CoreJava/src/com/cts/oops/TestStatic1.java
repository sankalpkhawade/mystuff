package com.cts.oops;

class Company{
	static String cname="java";
	static String caddress="DLF Hyderabad";
	static long cnumber=1234567890L;
	
	public static void companyDetails(){
		System.out.println("Company Name : "+cname+"\nCompany Address : "+caddress+"\nContact : "+cnumber);
	}
	
	static class Employee3{
		static String employeeName="James";
		static int employeeId=1122;
		static String tech="Java Technology";
		
		public void employeeDetails(){
			System.out.println("\nEmployee Name : "+employeeName+"\nEmployee ID : "+employeeId+"\nTechnology : "+tech);
		}
		
		static class Manager{
			static String managerName="James";
			static int managerId=1122;
			static String dept="Academy";
			
			public  void managerDetails(){
				System.out.println("\nManager Name : "+managerName+"\nManager ID : "+managerId+"\nDepartment : "+dept);
			}
			
			static class Account{
				static String ActHldName="John";
				static long ActNumber=21345698721L;
				static int cvv=1234;
				
				public void accountDetails(){
					System.out.println("\nAccount Holder Name : "+ActHldName+"\nAccount number : "+ActNumber+"\nCvv : "+cvv);
				}
			}
		}
	}
	
}

public class TestStatic1 {

	public static void main(String[] args) {
		
		Company.companyDetails();
		
		Company.Employee3 ce=new Company.Employee3();
		ce.employeeDetails();
		
		Company.Employee3.Manager cem=new Company.Employee3.Manager();
		cem.managerDetails();
		
		Company.Employee3.Manager.Account cema=new Company.Employee3.Manager.Account();
		cema.accountDetails();
	}

}
