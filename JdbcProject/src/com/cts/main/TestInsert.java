package com.cts.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {

	private static final String db_username = "root";
	private static final String db_password = "password-1";
	private static final String db_driverClass = "com.mysql.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/cts";

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;

		try {

			// step-1 load the driver
			Class.forName(db_driverClass);

			// step-2 get the connection
			connection = DriverManager.getConnection(db_url, db_username, db_password);

			// step-3 create statement
			String insertQuery = "insert into employee_table1 values('2021','Nag',90000.00)";
			statement = connection.createStatement();

			// step-4 execute statement using execute methods
			statement.executeUpdate(insertQuery);

			System.out.println("Data has been successfully inserted.");

		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
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
