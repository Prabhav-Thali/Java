package com.psl.EA3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseFunction {

	public static Connection con = null;
	public static Statement stmt = null;

	public DatabaseFunction() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");

			 con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/contactdb", "root", "root");

		stmt = con.createStatement();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
