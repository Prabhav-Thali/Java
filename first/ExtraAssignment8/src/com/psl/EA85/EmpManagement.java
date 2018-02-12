package com.psl.EA85;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmpManagement {
	int empId, contactNo, salary;
	String name, address;

	public EmpManagement(int empId, String name, String address, int contact,
			int sal) {
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.contactNo = contact;
		this.salary = sal;
	}

	public String addEmp() {
		return "insert into employee values ('" + empId + "','" + name + "','"
				+ address + "'," + contactNo + "," + salary + ")";
		// TODO Auto-generated method stub

	}

	public String displayAll() {
		return "Select * from employee";
	}

	public String searchEmp(int emp) {
		return "select * from employee where empId='" + emp + "'";
	}

}
