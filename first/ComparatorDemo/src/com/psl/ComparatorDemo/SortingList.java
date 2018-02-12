package com.psl.ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingList {

	public static void main(String[] args) {

		Employee e1 = new Employee(105, 34546, "Wolverine");
		Employee e2 = new Employee(103, 34545, "ironman");
		Employee e3 = new Employee(104, 34547, "Scorpion King");
		List<Employee> emp = new ArrayList<Employee>();//in treeSet also objects cannot be compared so use comparable

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);

		System.out.println(emp);

		System.out.println("id sorting");
		Collections.sort(emp);
		System.out.println(emp);
		
		System.out.println("salary sorting");
		Collections.sort(emp, new Comparator<Employee>() {

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
		});
		System.out.println(emp);
		
		System.out.println("Name sorting");
		Collections.sort(emp, new sortByName());
		System.out.println(emp);
	}
	}

