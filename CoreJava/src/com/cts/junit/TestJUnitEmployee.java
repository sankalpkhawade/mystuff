package com.cts.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestJUnitEmployee {

	Employee emp;
	
	@Before
	public void setUp(){
		emp=new Employee();
		emp.setEmployeeId(1);
		emp.setEmployeeName("Surya");
		emp.setSalary(50000.00);
		emp.setMobileNumber(7896541230L);
		emp.setEmailId("surya@gmail.com");
		emp.setPassword("java");
	}
	
	@Test
	public void testEmployee(){
		Assert.assertEquals(1, emp.getEmployeeId());
		Assert.assertEquals("Surya", emp.getEmployeeName());
		Assert.assertEquals(50000.00, emp.getSalary());
		Assert.assertEquals(7896541230L, emp.getMobileNumber());
		Assert.assertEquals("surya@gmail.com", emp.getEmailId());
		Assert.assertEquals("java", emp.getPassword());
	}
	
	@After
	public void shutDown(){
		System.out.println("----Closed----");
	}
}
