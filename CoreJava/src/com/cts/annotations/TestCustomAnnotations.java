package com.cts.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.METHOD)

@interface Employee{
	
	String employeeInfo();
}


class Manager{
	
	@Employee (employeeInfo = "james")
	public void managerInfo(){
		
		System.out.println("----Manager info----");

	}
}

public class TestCustomAnnotations {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Manager m=new Manager();
		Employee e=m.getClass().getAnnotation(Employee.class);
		System.out.println(e);
		Method m1=m.getClass().getMethod("managerInfo");
		Employee e1=m1.getAnnotation(Employee.class);
		System.out.println(e1.employeeInfo());
	}

}
