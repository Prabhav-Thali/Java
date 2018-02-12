package com.psl.employee;

public class Employee {
	int employeeId = 107, employeeSalary = 10000;
	String employeeName = "James Bond";

	public Employee(int id, int salary, String name) {
		System.out.println("Employee");
		employeeId = id;
		employeeName = name;
		employeeSalary = salary;

	}
	
void showEmp()
{
	System.out.println("Employee");
}
	void displayEmployee() {
		// TODO Auto-generated method stub
		System.out.println("EMployee is:" + employeeId + employeeName
				+ employeeSalary);
	}
}
