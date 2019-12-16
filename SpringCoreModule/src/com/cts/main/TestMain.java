package com.cts.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.core.Customer;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");
		Object object = context.getBean("customerObject");
		Customer customer = (Customer) object;
		
		customer.setCustomerId(1);
		customer.setCustomerName("Rod Johnson");
		customer.getAccount().setAccountNumber(44321256);
		customer.getAccount().setAccountHolderName("Johnson");

		System.out.println("----------------- Customer Details ------------");
		System.out.println("Customer Id : " + customer.getCustomerId());
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("-----------------------------------------------");
		
		System.out.println("\n----------------- Account Details -------------");
		System.out.println("Account Number : "+customer.getAccount().getAccountNumber());
		System.out.println("Account Holder Name : "+customer.getAccount().getAccountHolderName());
		System.out.println("-----------------------------------------------");
		
	}

}
