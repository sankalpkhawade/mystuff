//package com.cognizant.springlearn.dao;
//
//import java.util.ArrayList;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import com.cognizant.springlearn.SpringLearnApplication;
//import com.cognizant.springlearn.bean.Employee;
//import com.cognizant.springlearn.controller.EmployeeNotFoundException;
//
//@Component
//public class EmployeeDao {
//	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
//	static ArrayList<Employee> EMPLOYEE_LIST;
//	// @Autowired
//	// public void setEmployee(Employee employee) {
//	// this.employee = employee;
//	// LOGGER.info("EmployeeDao");
//	// }
//
//	@SuppressWarnings({ "unchecked", "resource" })
//	public EmployeeDao() {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
//		EMPLOYEE_LIST=(ArrayList<Employee>) context.getBean("employeeList");
//	}
//
////	int notfound = 0;
////
////	@SuppressWarnings("unused")
////	public void updateEmployee() throws EmployeeNotFoundException {
////		ArrayList<Employee> employee = new ArrayList<>();
////		for(Employee e:getAllEmployees()){
////			
////		}
////		if (notfound == 0) {
////			throw new EmployeeNotFoundException();
////		}
////	}
//
//	public ArrayList<Employee> getAllEmployees() {
//
//		return EMPLOYEE_LIST;
//	}
//}

package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.bean.Employee;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDao {
       private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
       private static ArrayList<Employee> EMPLOYEE_LIST;
       private static String[] DEPARTMENT_LIST;
       int notFound = 0;
       private ApplicationContext context;

       @SuppressWarnings("unchecked")
       public EmployeeDao() {
              // TODO Auto-generated constructor stub
              LOGGER.info("START - EMPLOYEE DAO CONSTRUCTOR");
              context = new ClassPathXmlApplicationContext("employee.xml");
              EMPLOYEE_LIST = (ArrayList<Employee>) context.getBean("employeeList");
              //DEPARTMENT_LIST = (String[]) context.getBean("departmentArray");
       }

       public ArrayList<Employee> getAllEmployees() {
              LOGGER.info("START - EMPLOYEE DAO");
              return EMPLOYEE_LIST;
       }
       
       public String[] getAllDepartments() {
              return DEPARTMENT_LIST;
       }

       public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
              LOGGER.info("START - EMPLOYEE DAO");
              for (Employee employeeList : EMPLOYEE_LIST) {
                     if (employeeList.getId() == employee.getId()) {
                           notFound = 1;
                           return employee;
                     }
              }
              if (notFound == 0) {
                     throw new EmployeeNotFoundException();
              }
              return null;
       }

       public Employee getEmployee(int id) throws EmployeeNotFoundException {
              LOGGER.info("START - EMPLOYEE DAO");
              for (Employee employee : EMPLOYEE_LIST) {
                     if (employee.getId() == id) {
                           notFound = 1;
                           return employee;
                     }
              }
              if (notFound == 0) {
                     throw new EmployeeNotFoundException();
              }
              return null;
       }
}