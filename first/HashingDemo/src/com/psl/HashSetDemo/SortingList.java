package com.psl.HashSetDemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingList {

	public static void main(String[] args) {

		Employee e1 = new Employee(105, 34546, "Wolverine");
		Employee e2 = new Employee(103, 34545, "ironman");
		Employee e3 = new Employee(104, 34547, "Scorpion King");
		Employee e4 = new Employee(104, 34547, "Scorpion King");
		Set<Employee> emp = new HashSet<Employee>();//in treeSet also objects cannot be compared so use comparable

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);

		System.out.println(emp);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());

		//System.out.println(e3.equals(e4));
		/*System.out.println("id sorting");
		Collections.sort(emp);
		System.out.println(emp);
		System.out.println("salary sorting");
		Collections.sort(emp, new sortBySalary());
		System.out.println(emp);
		System.out.println("Name sorting");
		Collections.sort(emp, new sortByName());
		System.out.println(emp);
	}*/
	}
}
