package com.psl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {
	public static void main(String[] args) {

		// String query = "create table emp(id int(10),name varchar(20))";
		// String query = "insert into emp values(122,'Nishit ')";
		// String query="update emp set name='Nishit' where id=122";
		String query = "select id,name from emp";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");
			System.out.println("created connection");

		
			// java.sql.Statement stmt = con.createStatement();

			// boolean b = stmt.execute(query);// it doesnt check if it is
			// inserted
			// it is to check if query returns
			// any data

			java.sql.Statement stmt = con.createStatement(
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery(query);

			// rs.afterLast();
			// while (rs.previous()) {
			// System.out.println(rs.getInt(1) + " " + rs.getString(2));
			// }

			rs.absolute(3);
			
			rs.relative(-1);
			rs.updateInt(1, 23);

			rs.updateRow();
			//System.out.println(rs.getInt(1) + " " + rs.getString(2));
rs.beforeFirst();

rs.close();

			 while(rs.next()){
			 System.out.println(rs.getInt(1)+rs.getString(2));
			 }

			// stmt.execute(query);
			System.out.println("table created ");

			stmt.close();

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// call forname from class named class by passsing name of driver
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
