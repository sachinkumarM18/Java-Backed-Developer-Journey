package com.mini_ecommerce_jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/mini_ecommerce_project";
	private static final String USER = "root";
	private static final String PWD = "Sachin@2824";
 
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PWD); 
	}
}
  