package com.psl.Ques1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Employee {
int id=0;List<String> l = new ArrayList<String>();
	public Employee(int id,List<String> l) {
		this.id=id;
		this.l=l;
		System.out.println("Employee ID:"+id+" has vehicles: ");
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("jaguar");
		l.add("audi");
		l.add("maruti");
		l.add("bmw");

		List<String> v2=(List<String>) Arrays.asList("mercedes","Hyundai");
		
		Employee e=new Employee(1,l);
		Employee e1=new Employee(2,v2);
		
	}
}
