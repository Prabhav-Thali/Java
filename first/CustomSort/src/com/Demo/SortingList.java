package com.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {

		Employee e1 = new Employee(105, 34545, "Wolverine");
		Employee e2 = new Employee(103, 34546, "ironman");
		Employee e3 = new Employee(104, 34547, "Scorpion King");
		List<Employee> emp = new ArrayList<Employee>();

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		System.out.println(emp);

		Collections.sort(emp);
		System.out.println(emp);
	}
}
