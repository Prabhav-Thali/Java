package com.psl.Assignement11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Emp {

	public static String display(int empno){
		
		String query="Select * from emp where empno="+empno+";";
		return query;
	}
	
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee", "root", "root");
			Statement stmt = con.createStatement();

			/*
			 * stmt.execute("create table emp (EMPNO INT(4) NOT NULL," +
			 * "ENAME VARCHAR(10) ," + "JOB       VARCHAR(9)," + " MGR INT(4),"
			 * + "HIREDATE  DATE," + "SAL FLOAT(7,2)," + "COMM FLOAT(7,2)," +
			 * "DEPTNO    INT(2));");
			 */

			// stmt.execute(" insert into emp values (104,'Nishit','abc',12,'1999-10-10',10000,1000.00,1)");
			// stmt.execute(" insert into emp values (105,'sdsd','def',13,'2001-10-10',11000,2000.00,2)");
			// stmt.execute(" insert into emp values (106,'sfdf','ghi',14,'2002-10-10',12000,3000.00,4)");
			// stmt.execute(" insert into emp values (107,'fgfg','jkl',15,'2003-10-10',13000,4000.00,2)");
			// stmt.execute(" insert into emp values (108,'vbb','mno',16,'2004-10-10',14000,5000.00,5)");
			// stmt.execute(" insert into emp values (109,'jhghj','pqr',17,'2005-10-10',15000,6000.00,3)");
			// stmt.execute(" insert into emp values (110,'fggf','stu',18,'2006-10-10',16000,7000.00,4)");
			// stmt.execute(" insert into emp values (111,'xcx','vwx',19,'2007-10-10',17000,8000.00,5)");
			// stmt.execute(" insert into emp values (112,'hhjk','yza',20,'2008-10-10',18000,9000.00,8)");
			// stmt.execute(" insert into emp values (113,'szdzd','bcd',21,'2009-10-10',19000,1100.00,4)");

			ResultSet rs = stmt.executeQuery("Select * from emp limit 5");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "
						+ rs.getString(3) + " " + rs.getInt(4) + " "
						+ rs.getDate(5) + " " + rs.getInt(6) + " "
						+ rs.getInt(7) + " " + rs.getInt(8));
			}
			
			ResultSet rs1 = stmt.executeQuery("Select count(empno) from emp");
			while(rs1.next())
			System.out.println("number of records are:"+rs1.getString (1));
			
			ResultSet rs2 = stmt.executeQuery(display(10545));
			if (rs2.next()) {
				System.out.println( rs2.getString(2) + " "
						+ rs2.getString(3) + " " + rs2.getInt(4) + " "
						+ rs2.getDate(5) + " " + rs2.getInt(6) + " "
						+ rs2.getInt(7) + " " + rs2.getInt(8));
			}
			else
				System.out.println("enter emp no. properly");
			
			ResultSet rs3 = stmt.executeQuery(display(111));
			if (rs3.next()) {
				System.out.println( rs3.getString(1) + "old salary is: "
						+ rs3.getString(6));
				int i=stmt.executeUpdate(update(111));
				if(i==1){ResultSet rs4 = stmt.executeQuery(display(111));
				if (rs4.next()) {
					System.out.println( rs4.getString(1) + "New salary is: "
							+ rs4.getString(6));

				}
				}
//				ResultSet rs4 = stmt.executeUpdate(update(107));
//				if (rs4.next()) {
//					System.out.println( rs4.getString(2) + " "
//							+ rs4.getString(3) + " " + rs4.getInt(4) + " "
//							+ rs4.getDate(5) + " " + rs4.getInt(6) + " "
//							+ rs4.getInt(7) + " " + rs4.getInt(8));
		}
			else
				System.out.println("enter valid emp no.");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static String update(int empnum) {
		String query="update emp set sal='"+15000+"'where empno="+empnum+";";
		return query;
	
		// TODO Auto-generated method stub

	}
}
