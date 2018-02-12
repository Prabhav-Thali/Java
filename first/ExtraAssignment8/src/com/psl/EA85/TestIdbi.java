package com.psl.EA85;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestIdbi {

	public static void main(String[] args) {
		EmpManagement em[] = new EmpManagement[5];
		// em[0] = new EmpManagement(1, "Nishit", "Mapusa", 39434, 23232);
		em[1] = new EmpManagement(2, "pishit", "papusa", 40434, 34344);
		em[2] = new EmpManagement(3, "kishit", "kapusa", 45645, 65454);
		em[3] = new EmpManagement(4, "lishit", "lapusa", 56565, 45454);
		em[4] = new EmpManagement(5, "cishit", "capusa", 23232, 56677);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "root");
			System.out.println("created connection");
			Statement stmt = con.createStatement();
			// em[0] = new EmpManagement(1, "Nishit", "Mapusa", 39434, 23232);
			em[1] = new EmpManagement(2, "pishit", "papusa", 40434, 34344);
			em[2] = new EmpManagement(3, "kishit", "kapusa", 45645, 65454);
			em[3] = new EmpManagement(4, "lishit", "lapusa", 56565, 45454);
			em[4] = new EmpManagement(5, "cishit", "capusa", 23232, 56677);

			// stmt.addBatch(em[1].addEmp());
			// stmt.addBatch(em[2].addEmp());
			// stmt.addBatch(em[3].addEmp());
			// stmt.addBatch(em[4].addEmp());
			// stmt.executeBatch();
			// System.out.println("inserted");

			ResultSet rs1 = stmt.executeQuery(em[1].displayAll());
			while (rs1.next()) {
				System.out.println("Id: " + rs1.getInt(1) + "Emp name: "
						+ rs1.getString(2) + "Address: " + rs1.getString(3)
						+ "contact: " + rs1.getInt(4) + "salary: "
						+ rs1.getInt(5));
			}
			int id=3;
			System.out.println("\nsearch for id: "+id);
			ResultSet rs2 = stmt.executeQuery(em[1].searchEmp(3));
		int i=0;
				
		
				while (rs2.next()) {
i=1;
					System.out.println("Id: " + rs2.getInt(1) + "Emp name: "
							+ rs2.getString(2) + "Address: " + rs2.getString(3)
							+ "contact: " + rs2.getInt(4) + "salary: "
							+ rs2.getInt(5));
				}
			if(i==0)
				System.out.println("enter proper empid");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
