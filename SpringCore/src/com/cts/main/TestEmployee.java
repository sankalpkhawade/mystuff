package com.cts.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.core.Employee;

public class TestEmployee {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig/employee-config.xml");
		Object object = context.getBean("employeeObject");
		Object object1 = context.getBean("employeeObject1");
		Object object2 = context.getBean("employeeObject2");
		Employee employee = (Employee) object;
		Employee employee1 = (Employee) object1;
		Employee employee2 = (Employee) object2;
		System.out.println("---------------------------------------------");
		System.out.println("Employee Id : " + employee.getEmployeeId());
		System.out.println("Employee Name : " + employee.getEmployeeName());
		System.out.println("Employee Password : " + employee.getPassword());
		System.out.println("---------------------------------------------");
		System.out.println("Employee Id : " + employee1.getEmployeeId());
		System.out.println("Employee Name : " + employee1.getEmployeeName());
		System.out.println("Employee Password : " + employee1.getPassword());
		System.out.println("---------------------------------------------");
		System.out.println("Employee Id : " + employee2.getEmployeeId());
		System.out.println("Employee Name : " + employee2.getEmployeeName());
		System.out.println("Employee Password : " + employee2.getPassword());
	}

}
