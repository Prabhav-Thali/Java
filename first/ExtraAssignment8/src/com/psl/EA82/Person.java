package com.psl.EA82;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Person {
	int personID;
	String personName;
	long personTelephone;

	Map<String, Float> m = new TreeMap<String, Float>();

	public void addPerson(int personID, String personName, long personTelephone) {
		this.personID = personID;
		this.personName = personName;
		this.personTelephone = personTelephone;

		try {

			DatabaseFunction.stmt.execute("insert into person values("
					+ personID + ",'" + personName + "'," + personTelephone
					+ ");");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void search(String name) {
		System.out.println("searching by name:" + name);

		try {
			ResultSet rs = DatabaseFunction.stmt
					.executeQuery("Select * from person where name='" + name
							+ "';");
			int f = 0;
			while (rs.next()) {
				f = 1;
				System.out.println("ID: " + rs.getString(1) + "name: "
						+ rs.getString(2) + " Phone: " + rs.getString(3));
			}
			if (f == 0) {
				try {
					throw new personNotFoundException();
				} catch (personNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Person p = new Person();
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the details");
				System.out.println("enter id:");
				int id = sc.nextInt();
				System.out.println("enter name ");
				String nam = sc.next();
				System.out.println("enter number");
				Long num = sc.nextLong();
				addPerson(id, nam, num);
				System.out.println("added successfully");
				generateBill();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void generateBill() {
		int p = 0;float total=0;
		System.out.println("PersonName		GroceryType		Quantity (Kgs.)		Price");
		System.out.print(personName);
		for (Map.Entry<String, Float> e : m.entrySet()) {
			ResultSet rs1;
			try {
				rs1 = DatabaseFunction.stmt
						.executeQuery("select price from grocery where groceryName='"
								+ e.getKey() + "';");

				while (rs1.next()) {
					p = rs1.getInt(1);
					total+=p*e.getValue();
				}
				System.out.print("\t\t\t" + e.getKey() + " \t\t " + e.getValue()
						+ "\t\t\t" + p * e.getValue());
				
				System.out.println();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		System.out.println("\t\t\t\t\t\tTotal: "+total);
	}
}