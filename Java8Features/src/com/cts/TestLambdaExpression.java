package com.cts;

@FunctionalInterface
interface Employee {

	void employeeInfo(int employeeId, String employeeName);
	
	//Java8 Feature
	default void info1(){
		System.out.println("default method");
	}
}

public class TestLambdaExpression {

	public static void main(String[] args) {

		System.out.println("---------- Java 7 ----------");
		Employee employee = new Employee() {

			@Override
			public void employeeInfo(int employeeId, String employeeName) {

				System.out.println(employeeId + "\t" + employeeName);
			}

		};
		employee.employeeInfo(1, "James");
		System.out.println("---------- Java 8 Feature Lambda Expression ----------");
		Employee employee1=(employeeId,employeeName)->{
			System.out.println(employeeId+"\t"+employeeName);
		};
		employee1.employeeInfo(2, "Gosling");
		employee.info1();
	}

}
