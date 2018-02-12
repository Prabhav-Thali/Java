package com.psl.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preparestmtDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");

			System.out.println("create connecn");

			// PreparedStatement pstmt =
			// con.prepareStatement("insert into emp values(?,?)");

			CallableStatement cst = con.prepareCall("{call MyProcedure(?,?)} ");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter id:");
			int id = sc.nextInt();
			System.out.println("enter name:");
			String name = sc.next();
			cst.setInt(1, id);
			cst.setString(2, name);

			cst.execute();

			System.out.println("DOneeeee!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
