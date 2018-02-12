package com.psl.EA2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Company {
	List<Company> lc = new ArrayList<Company>();

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/empdb", "root", "root");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from empdetails");

			String desg = "Developer";

			while (rs.next()) {

				if (desg.equals(rs.getString(3))) {
					System.out.println("data for" + desg + " :" + rs.getInt(1)
							+ " " + rs.getString(2) + " " + rs.getString(3)
							+ " " + rs.getInt(4));
				}
			}
			int id = 1005;
			String nd = "QE";
			int c = stmt.executeUpdate("update empdetails set empdesignation='"
					+ nd + "',empsalary=50000 where empid=" + id + ";");
			if (c == 1) {

				ResultSet rs2 = stmt.executeQuery("select * from empdetails");
				while (rs2.next()) {
					if (id == (rs2.getInt(1))) {
						System.out.println("updated data for id:"
								+ rs2.getInt(1) + " " + rs2.getString(2) + " "
								+ rs2.getString(3) + " " + rs2.getInt(4));
					}
				}

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
