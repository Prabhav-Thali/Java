package com.psl.Assignment6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Movies {
	public static String addMovie(int id, String n, String lang, String da) {

		return "insert into movie values('" + id + "','" + n + "','" + lang
				+ "','" + da + "');";

	}

	public static String addShow(String showtime, int ticket, int id) {
		// TODO Auto-generated method stub
		return "insert into shows values('" + showtime + "','" + ticket + "','"
				+ id + "');";

	}

	public static String deleteShow(int id) {
		return "delete from shows where id=" + id + ";";
	}

	static String updateShows(int id, String tim) {

		// TODO Auto-generated method stub
		return "update shows set tickets=" + 60 + " where id=" + id
				+ " and showtime='" + tim + "';";

	}

	public static void main(String[] args) {
		File f = new File("movies.txt");

		FileInputStream fis = null;
		String str1[] = new String[4];

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						fis));
				String str;
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Done with driver");

				java.sql.Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/movies", "root", "root");
				System.out.println("Connection done");

				java.sql.Statement stmt = con.createStatement();
				// 1st table
				// String query = "create table movie(id int primary key,"
				// + "name varchar(50),"
				// + "language varchar(20),"
				// + "date varchar(10));";
				// 2nd table
				// String query1 = "create table shows(showtime varchar(10),"
				// + "tickets int,"
				// + "id int,"
				// + "primary key(id,showtime),"
				// + "foreign key(id) REFERENCES movie(id));";
				// table creation
				// stmt.executeQuery("query");
				// stmt.execute(query1);
				// System.out.println("show table created");
				// System.out.println("table created");
				// insertion in 1st table
				for (int i = 0; (str = br.readLine()) != null; i++) {

					str1 = str.split(",");
					// String query =
					// "insert into movie values('"+str1[0]+"','"+str1[1]+"','"+str1[2]+"','"+str1[3]+"');";
					// stmt.execute(query);
					// System.out.println("inserted");
				}

				// String user = addMovie(9, "RAMBO", "English", "12/6/1996");
				// stmt.execute(user);

				// String showQuery = addShow("6:30 PM", 60 , 1);
				// stmt.execute(showQuery);

				// stmt.execute(deleteShow(6));

				// stmt.execute(updateShows(9,"10:00 AM"));

				ResultSet rs = stmt.executeQuery("select * from movie");
				System.out.println("Movie Table");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2)
							+ " " + rs.getString(3) + " " + rs.getString(4));
				}

				ResultSet rs1 = stmt.executeQuery("select * from shows");
				System.out.println("Shows Table");
				while (rs1.next()) {
					System.out.println(rs1.getInt(1) + " " + rs1.getString(2)
							+ " " + rs1.getString(3) + ";");
				}

				System.out.println("\n\ndisplay movies by language");
				ResultSet rs2 = stmt
						.executeQuery("select * from movie order by language");
				while (rs2.next()) {
					System.out.println(rs2.getInt(1) + " " + rs2.getString(2)
							+ " " + rs2.getString(3) + " " + rs2.getString(4));
				}

				System.out.println("\ndisplay by show time");
				ResultSet rs3 = stmt
						.executeQuery("select * from movie join shows using (id) order by showtime");
				while (rs3.next()) {
					System.out.println(rs3.getInt(1) + " " + rs3.getString(2)
							+ " " + rs3.getString(3) + " " + rs3.getString(4)
							+ " " + rs3.getString(5) + " " + rs3.getString(6));
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
