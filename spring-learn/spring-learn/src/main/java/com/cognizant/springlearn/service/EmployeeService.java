//package com.cognizant.springlearn.service;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.context.request.WebRequest;
//
//import com.cognizant.springlearn.SpringLearnApplication;
//import com.cognizant.springlearn.bean.Employee;
//import com.cognizant.springlearn.dao.EmployeeDao;
//import com.fasterxml.jackson.databind.exc.InvalidFormatException;
//
//@Service
//public class EmployeeService {
//	private EmployeeDao employeeDao;
//	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
//
////	@Autowired
////	public void setEmployeeDao(EmployeeDao employeeDao) {
////		this.employeeDao = employeeDao;
////		LOGGER.info("EmployeeService");
////	}
//
//	public EmployeeService() {
//
//	}
//
//	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
//	public void EmployeeNotFoundException() {
//
//	}
//
////	public void updateEmployee() {
////		EmployeeDao empDao = new EmployeeDao();
////		try {
////			empDao.updateEmployee();
////		} catch (com.cognizant.springlearn.controller.EmployeeNotFoundException e) {
////
////			e.printStackTrace();
////		}
////	}
//
//	// @Transactional
//	public ArrayList<Employee> getAllEmployees() {
//
//		EmployeeDao employeeDao = new EmployeeDao();
//		return employeeDao.getAllEmployees();
//	}
//
//	@SuppressWarnings("unused")
//	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//		Map<String, Object> body = new LinkedHashMap<>();
//		body.put("timestamp", new Date());
//		body.put("status", status.value());
//		body.put("error", "Bad Request");
//
//		List<String> errors = new ArrayList<String>();
//		if (ex.getCause() instanceof InvalidFormatException) {
//			final Throwable cause = ex.getCause() == null ? ex : ex.getCause();
//			for (InvalidFormatException.Reference reference : ((InvalidFormatException) cause).getPath()) {
//				body.put("message", "Incorrect format for field '" + reference.getFieldName() + "'");
//			}
//		}
//
//		return new ResponseEntity<>(body, headers, status);
//	}
//
//}


package com.cognizant.springlearn.service;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.dao.EmployeeDao;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.bean.Employee;

@Service
public class EmployeeService {

       private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
       EmployeeDao employeeDao = new EmployeeDao();

       public ArrayList<Employee> getAllEmployees() {
              LOGGER.info("START - EMPLOYEE SERVICE");
              return employeeDao.getAllEmployees();
       }

       public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
              LOGGER.info("START - EMPLOYEE SERVICE");
              return employeeDao.updateEmployee(employee);
       }

       public Employee getEmployee(int id) throws EmployeeNotFoundException {
              LOGGER.info("START - EMPLOYEE SERVICE");
              return employeeDao.getEmployee(id);
       }
       
       public String[] getAllDepartments() {
              return employeeDao.getAllDepartments();
       }
}