package com.cts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.model.EmployeeModel;

public class EmployeeDaoImpl implements EmployeeDao {

	private static final String db_username = "root";
	private static final String db_password = "password-1";
	private static final String db_driverClass = "com.mysql.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/cts";

	EmployeeModel employeeModel = new EmployeeModel();

	Connection connection = null;
	PreparedStatement preparedStatement = null;

	@Override
	public void addEmployee() {

		try {
			// step-1
			Class.forName(db_driverClass);
			// step-2
			connection = DriverManager.getConnection(db_url, db_username, db_password);
			// step-3
			String insertQuery = "insert into employee_table1 values(?,?,?)";
			preparedStatement = connection.prepareStatement(insertQuery);

			employeeModel.setEmployeeId("ABC123");
			employeeModel.setEmployeeName("James Gosling");
			employeeModel.setSalary(480000.00);

			// set the values to preparedStatement object
			preparedStatement.setString(1, employeeModel.getEmployeeId());
			preparedStatement.setString(2, employeeModel.getEmployeeName());
			preparedStatement.setDouble(3, employeeModel.getSalary());

			// step-4
			preparedStatement.executeUpdate();
			System.out.println("Data has been added successfully");

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

	@Override
	public void showEmployee() {

		try {
			// step-1
			Class.forName(db_driverClass);
			// step-2
			connection = DriverManager.getConnection(db_url, db_username, db_password);
			// step-3
			String selectQuery = "select * from employee_table1";
			preparedStatement = connection.prepareStatement(selectQuery);

			// step-4
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			}
			System.out.println("Data has been added successfully");

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

	@Override
	public void updateEmployee() {

		try {
			// step-1
			Class.forName(db_driverClass);
			// step-2
			connection = DriverManager.getConnection(db_url, db_username, db_password);
			// step-3
			String updateQuery = "update employee_table1 set employeeName=? where employeeId='ABC123'";
			preparedStatement = connection.prepareStatement(updateQuery);

			employeeModel.setEmployeeName("Jerry");

			// set the values to preparedStatement object
			preparedStatement.setString(1, employeeModel.getEmployeeName());

			// step-4
			preparedStatement.executeUpdate();
			System.out.println("Data has been updated successfully");

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

	@Override
	public void deleteEmployee() {

		try {
			// step-1
			Class.forName(db_driverClass);
			// step-2
			connection = DriverManager.getConnection(db_url, db_username, db_password);
			// step-3
			String deleteQuery = "delete from employee_table1 where employeeId='ABC123'";
			preparedStatement = connection.prepareStatement(deleteQuery);

			// step-4
			preparedStatement.executeUpdate();
			System.out.println("Data has been deleted successfully");

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

}
