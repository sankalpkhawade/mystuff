package com.cts;

import java.util.ArrayList;
import java.util.stream.Stream;
import org.omg.Messaging.SyncScopeHelper;

class Employee2 {

	private int employeeId;
	private String employeeName;
	private double salary;

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

}

public class TestFilterCollection {

	public static void main(String[] args) {

		Employee2 employee1 = new Employee2();
		Employee2 employee2 = new Employee2();
		Employee2 employee3 = new Employee2();

		employee1.setEmployeeId(1);
		employee1.setEmployeeName("James");
		employee1.setSalary(25000.00);

		employee2.setEmployeeId(2);
		employee2.setEmployeeName("Gosling");
		employee2.setSalary(26000.00);

		employee3.setEmployeeId(3);
		employee3.setEmployeeName("Gavin");
		employee3.setSalary(24000.00);

		ArrayList<Employee2> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		Stream<Employee2> stream = employeeList.stream().filter(e -> e.getSalary() >= 25000.00);
		stream.forEach(
				e1 -> System.out.println(e1.getEmployeeId() + "\t" + e1.getEmployeeName() + "\t" + e1.getSalary()));
	}
}