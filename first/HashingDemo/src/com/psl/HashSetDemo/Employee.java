package com.psl.HashSetDemo;


import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());//System.out.println("hash"+employeeName.hashCode());
		result = prime * result + employeeSalary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeSalary != other.employeeSalary)
			return false;
		return true;
	}

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
		return "Employee is:" + employeeId + employeeName + employeeSalary;
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
