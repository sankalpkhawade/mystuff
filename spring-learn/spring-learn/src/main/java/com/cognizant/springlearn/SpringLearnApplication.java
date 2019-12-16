package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.springlearn.bean.Employee;

import com.cognizant.springlearn.Country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(SpringLearnApplication.class, args);
		// displayDate();
		// displayCountry();
		// displayCountries();
		// displayEmployee();
		// getEmployeeController();
	}

	// private static void getEmployeeController() {
	// LOGGER.debug("Inside Employee Controller");
	// }
	//
	// @SuppressWarnings("resource")
	// private static void displayEmployee() {
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("employee.xml");
	// Object object = context.getBean("employeeObject");
	// Employee emp = (Employee) object;
	// LOGGER.debug(emp.toString());
	// }
	//
	// @SuppressWarnings("resource")
	// public static void displayDate() throws ParseException {
	// LOGGER.info("START");
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("date-format.xml");
	// SimpleDateFormat format = context.getBean("dateFormat",
	// SimpleDateFormat.class);
	// String date = "31/12/2018";
	// LOGGER.debug(date);
	// System.out.println(format.parse(date));
	// LOGGER.info("END");
	// }
	//
	// @SuppressWarnings("resource")
	// public static void displayCountry() {
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("country.xml");
	// Country country = (Country) context.getBean("country", Country.class);
	// LOGGER.debug("Country : {}", country.toString());
	// }
	//
	// @SuppressWarnings({ "resource", "unchecked" })
	// public static void displayCountries() {
	// ArrayList<Country> anotherCountry = null;
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("country.xml");
	// Object object = context.getBean("countryList");
	// anotherCountry = (ArrayList<Country>) object;
	// LOGGER.debug("Country : {}", anotherCountry);
	// }

}
