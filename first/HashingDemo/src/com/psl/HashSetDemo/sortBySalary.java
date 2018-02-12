package com.psl.HashSetDemo;


import java.util.Comparator;

public class sortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int i=0;
		if(o1.employeeSalary>o2.employeeSalary)
		{
			i=1;
		}
		else if(o1.employeeSalary<o2.employeeSalary){
			i=-1;
			
		}
		else
			i=0;
	
	return i;
	}

	
}
