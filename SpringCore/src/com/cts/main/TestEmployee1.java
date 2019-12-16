package com.cts.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.core.Employee1;

public class TestEmployee1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig/employee1-config.xml");

		Object object = context.getBean("employee");
		Employee1 emp = (Employee1) object;
		System.out.println("---------------------------------------------");
		System.out.println("Dependency Constructor Spring Class");
		System.out.println("---------------------------------------------");
		emp.emploloyeeInfo();
		System.out.println("---------------------------------------------");

	}

}
