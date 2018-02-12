package com.psl.employee;

public class Employee {

	static int employeeId;
	int employeeSalary;
	String employeeName;

	public Employee(String name, int salary) {
		// TODO Auto-generated constructor stub
		employeeId++;

		employeeSalary = salary;
		employeeName = name;

	}

	static {
		System.out.println("hello");

	}

	private void displayEmployee() {
		System.out.println("Employee Is:" + employeeId + employeeName
				+ employeeSalary);
	}
	//to modify behavior of toString
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Employee is:" +employeeId+employeeName+employeeSalary;
	
}
	public static void main(String[] args) {
		Employee e1 = new Employee("Ashish", 1000000);
		e1.displayEmployee();
		Employee e2 = new Employee("Gauresh", 1200000);
		e2.displayEmployee();
		Employee e3 = new Employee("Nishit", 2000000);
		e3.displayEmployee();
		
		System.out.println(e1.toString());//can simply print e1 it will call toString
	}
}
