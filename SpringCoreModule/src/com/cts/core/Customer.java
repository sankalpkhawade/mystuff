package com.cts.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerObject")
public class Customer {

	private int customerId;
	private String customerName;
	
	@Autowired
	private Account account;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Account getAccount() {
		return account;
	}

	@Autowired
	public void setAccount(Account account) {
		this.account = account;
	}

}
