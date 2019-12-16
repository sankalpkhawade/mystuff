package com.cts.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cts.model.Employee;

public class EmployeeDAO implements employee{

	private static final String db_username = "root";
	private static final String db_password = "password-1";
	private static final String db_driverClass = "com.mysql.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/payroll";

	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ArrayList<Employee> employeeList=new ArrayList<>();
	
	public void addEmployee(Employee employee) {

		try {
			// step-1
			Class.forName(db_driverClass);
			// step-2
			connection = DriverManager.getConnection(db_url, db_username, db_password);
			// step-3
			String insertQuery = "insert into employee values(?,?,?,?)";
			preparedStatement = connection.prepareStatement(insertQuery);

			// set the values to preparedStatement object
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDate(3, employee.getDate_of_birth());
			preparedStatement.setDouble(4, employee.getSalary());

			// step-4
			preparedStatement.executeUpdate();
			System.out.println("The Given data is successfully inserted to the database.");

		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public ArrayList<Employee> getAllEmployees(){
        
        try {
               Class.forName(db_driverClass);
               connection=DriverManager.getConnection(db_url, db_username, db_password);
               String slectQuery="select * from employee";
               preparedStatement=connection.prepareStatement(slectQuery);
               ResultSet result=preparedStatement.executeQuery();
               while(result.next()){
                     Employee e=new Employee(result.getString(2),result.getDate(3),result.getInt(4));
                     employeeList.add(e);
               }
        } catch (Exception e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
        }
        
        return employeeList;
        
 }

}
