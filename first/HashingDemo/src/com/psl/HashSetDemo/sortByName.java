package com.psl.HashSetDemo;


import java.util.Comparator;

public class sortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.employeeName.compareTo(o2.employeeName);
		
	}

	

}
