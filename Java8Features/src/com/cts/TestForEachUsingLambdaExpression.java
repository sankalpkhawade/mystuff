package com.cts;

import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

class Employee1 {

	private int employeeId;
	private String employeeName;

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

}

public class TestForEachUsingLambdaExpression {

	public static void main(String args[]) {

		Employee1 employee1 = new Employee1();
		Employee1 employee2 = new Employee1();
		Employee1 employee3 = new Employee1();

		employee1.setEmployeeId(1);
		employee1.setEmployeeName("James");

		employee2.setEmployeeId(2);
		employee2.setEmployeeName("Gosling");

		employee3.setEmployeeId(3);
		employee3.setEmployeeName("Gavin");

		ArrayList<Employee1> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
		System.out.println("----------- for each loop without lambda expression -----------");
		for(Employee1 e:employeeList){
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName());
		}
		System.out.println("----------- for each loop with lambda expression -----------");
		employeeList.forEach((e)->System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()));
	}
}
