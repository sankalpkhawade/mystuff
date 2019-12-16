package com.cts.controller;

import com.cts.dao.EmployeeDaoImpl;

public class TestPreparedStatementInsert {

	public static void main(String[] args) {

		EmployeeDaoImpl daoImpl = new EmployeeDaoImpl();
		//daoImpl.addEmployee();
		//daoImpl.updateEmployee();
	//	daoImpl.deleteEmployee();
		daoImpl.showEmployee();

	}

}
