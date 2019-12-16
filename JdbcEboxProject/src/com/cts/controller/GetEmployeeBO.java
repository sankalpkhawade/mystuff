package com.cts.controller;

import java.util.ArrayList;

import com.cts.dao.EmployeeDAO;
import com.cts.model.Employee;

public class GetEmployeeBO {
       public static void display(ArrayList<Employee> employeeList){
              int len=employeeList.size();
              int i=0;
              while(i<len){
                     System.out.println(employeeList.get(i).getName()+" "+employeeList.get(i).getDate_of_birth()+" "+employeeList.get(i).getSalary());
                     i++;
              }
       }
              public static void main(String args[]){
                     EmployeeDAO employeeDao=new EmployeeDAO();
                     ArrayList<Employee> employeeList=employeeDao.getAllEmployees();
                     display(employeeList);
              }
              
              
}

