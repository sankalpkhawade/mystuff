////package com.cognizant.springlearn.controller;
////
////import java.util.ArrayList;
////
////import javax.validation.Valid;
////
////import org.slf4j.Logger;
////import org.slf4j.LoggerFactory;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.context.ApplicationContext;
////import org.springframework.context.support.ClassPathXmlApplicationContext;
////
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PutMapping;
////import org.springframework.web.bind.annotation.RequestBody;
////import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RequestMethod;
////import org.springframework.web.bind.annotation.RestController;
////
////import com.cognizant.springlearn.SpringLearnApplication;
////import com.cognizant.springlearn.bean.Employee;
////import com.cognizant.springlearn.service.EmployeeService;
////
////
////@RestController
////public class EmployeeController {
////	private EmployeeService employeeService;
////	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
////
//////	@Autowired
//////	public void setEmployeeService(EmployeeService employeeService) {
//////		this.employeeService = employeeService;
//////		LOGGER.info("EmployeeController");
//////	}
////
////	public EmployeeController() {
////
////	}
////
////	@SuppressWarnings("resource")
////	@RequestMapping(value = "/employee", method = RequestMethod.GET)
////	public String getEmployee() {
////		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
////		Object object = context.getBean("employeeObject");
////		Employee emp = (Employee) object;
////		LOGGER.debug(emp.toString());
////		return emp.toString();
////	}
////
////	@PutMapping
////	public void updateEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException{
////		
////	}
////	
////	@GetMapping("/employees")
////	public ArrayList<Employee> getAllEmployees(){
////		EmployeeService employeeService=new EmployeeService();
////		return employeeService.getAllEmployees();
////	}
////}
//
//
//package com.cognizant.springlearn.controller;
//
//import java.util.ArrayList;
//import javax.validation.Valid;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.cognizant.springlearn.SpringLearnApplication;
//import com.cognizant.springlearn.bean.Employee;
//import com.cognizant.springlearn.service.EmployeeService;
//import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;
//
//@RestController
//@CrossOrigin("http://localhost:4200")
//public class EmployeeController {
//
//       private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
//       EmployeeService employeeService = new EmployeeService();
//
//       @GetMapping(value = "/employees")
//       public ArrayList<Employee> getAllEmployees() {
//              LOGGER.info("START - EMPLOYEE CONTROLLER");
//              return employeeService.getAllEmployees();
//       }
//
//       @PutMapping(value = "/employees")
//       public void updateEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException {
//              LOGGER.info("START - EMPLOYEE CONTROLLER");
//              LOGGER.info(employeeService.updateEmployee(employee).toString());
//       }
//
//       @GetMapping(value = "/employees/{id}")
//       public Employee getEmployee(@PathVariable("id") int id) throws EmployeeNotFoundException {
//              LOGGER.info("START - EMPLOYEE CONTROLLER");
//              LOGGER.info(employeeService.getEmployee(id).toString());
//              return employeeService.getEmployee(id);
//       }
//       
//       @GetMapping(value="/departments")
//       public String[] getAllDepartments() {
//              LOGGER.info("START - EMPLOYEE CONTROLLER");
//              return employeeService.getAllDepartments();
//       }
//
//}

package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.bean.Employee;
import com.cognizant.springlearn.bean.Skill;
import com.cognizant.springlearn.dto.DepartmentDTO;
import com.cognizant.springlearn.dto.EmployeeDTO;
import com.cognizant.springlearn.dto.SkillDTO;
import com.cognizant.springlearn.service.EmployeeService;

@CrossOrigin("http://localhost:4200")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<EmployeeDTO> getAllEmployees() {
		LOGGER.info("Start");
		List<Employee> employeeList = empService.getAllEmployees();
		return transformEmployeeToDTO(employeeList);
	}

	private List<EmployeeDTO> transformEmployeeToDTO(List<Employee> employeeList) {
		LOGGER.info("Start");
		List<EmployeeDTO> employeeDTOs = new ArrayList<>();
		for (Employee employee : employeeList) {
			Set<SkillDTO> skillDTOs = new HashSet<>();
			EmployeeDTO employeeDTO = new EmployeeDTO();
			DepartmentDTO departmentDTO = new DepartmentDTO();
			employeeDTO.setId(employee.getId());
			employeeDTO.setName(employee.getName());
			employeeDTO.setDateOfBirth(employee.getDateOfBirth());
			employeeDTO.setPermanent(employee.isPermanent());
			employeeDTO.setSalary(employee.getSalary());
			departmentDTO.setId(employee.getDepartment().getId());
			departmentDTO.setName(employee.getDepartment().getName());
			employeeDTO.setDepartmentDTO(departmentDTO);
			for (Skill skill : employee.getSkills()) {
				SkillDTO skillDTO = new SkillDTO();
				skillDTO.setId(skill.getId());
				skillDTO.setName(skill.getName());
				skillDTOs.add(skillDTO);
				System.out.print(skillDTO.getName());
			}
			System.out.println();
			employeeDTO.setSkillDTOList(skillDTOs);
			System.out.println(employeeDTO.getSkillDTOList());
			employeeDTOs.add(employeeDTO);
			System.out.println(employeeDTOs);
		}
		LOGGER.info("End");
		return employeeDTOs;
	}

	// @DeleteMapping(value="/employees/{id}")
	// public ArrayList<Employee> delete(@PathVariable("id") int id){
	// return empService.delete(id);
	// }
	// @PostMapping(value="/employees")
	// public ArrayList<Employee> create(@RequestBody Employee emp){
	// return empService.create(emp);
	// }
}