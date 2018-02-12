package com.psl.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");
			System.out.println("created connection");

			Statement stmt = con.createStatement();

			stmt.addBatch("update emp set name='efg'  where id=14");
			stmt.addBatch("insert into emp values (17,'zab')");
			stmt.addBatch("insert into emp values (18,'asas')");
//			stmt.addBatch("insert into emp values (15,'xyz')");
//			stmt.addBatch("insert into emp values (16,'mno')");

			int i[] = stmt.executeBatch();

			for (int j = 0; j < i.length; j++) {
				System.out.println(i[j]);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Driver Loaded");

	}
}
