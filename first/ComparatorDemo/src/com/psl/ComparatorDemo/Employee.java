package com.psl.ComparatorDemo;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	int employeeId = 107, employeeSalary = 10000;
	String employeeName = "James Bond";

	public Employee(int id, int salary, String name) {
		// System.out.println("Employee");
		employeeId = id;
		employeeName = name;
		employeeSalary = salary;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee is: " + employeeId +" "+ employeeName +" "+ employeeSalary;
	}

	@Override
	public int compareTo(Employee arg) {
		// TODO Auto-generated method stub
		if (this.employeeId > arg.employeeId)// one object is argument passed
												// and other one is the one of
												// the calling class
			return 1;
		else if (this.employeeId < arg.employeeId)
			return -1;
		else
			return 0;

	}

	
}
