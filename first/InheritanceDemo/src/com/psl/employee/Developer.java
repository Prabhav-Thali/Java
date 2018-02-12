package com.psl.employee;

public class Developer extends Employee {
	int pf = 5000, ta = 10000, hra = 20000;

	public Developer(int id, int salary, String name, int pf, int ta, int hra) {
		
		super(id, salary, name);
		System.out.println("Developer");
		this.pf = pf;
		this.ta = ta;
		this.hra = hra;
		// TODO Auto-generated constructor stub
	}
@Override
void displayEmployee() {
	// TODO Auto-generated method stub
	super.displayEmployee();
	int netSalary = employeeSalary + pf + ta + hra;
	System.out.println("Developer is:" + employeeId + employeeName
			+ netSalary);
	
}
	/*
	 * void displayDeveloper() { // TODO Auto-generated method stub int
	 * netSalary = employeeSalary + pf + ta + hra;
	 * System.out.println("Developer is:" + employeeId + employeeName +
	 * netSalary);
	 * 
	 * }
	 */
}
