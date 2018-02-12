package com.psl.ques6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class printColl<T> {

	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public void printC(T o) {
		// TODO Auto-generated constructor stub

		System.out.println(o.getClass().getSimpleName()+" "+  o );

	}

	public static void main(String[] args) {
		printColl<List> pc = new printColl<List>();
		//printColl<LinkedList> pc = new printColl<LinkedList>();
		printColl<Set> pc1 = new printColl<Set>();
		//printColl<List> pc = new printColl<List>();
		
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> ll = new LinkedList<Integer>();
		Set<Integer> hs = new HashSet<Integer>();
		Set<Integer> ts = new TreeSet<Integer>();
		l.add(10);	l.add(20);	l.add(30);
		pc.setObj(l);
		pc.printC(l);
		
		ll.add(15);	ll.add(25);	ll.add(35);
		pc.setObj(ll);;
		pc.printC(ll);
		hs.add(16);	hs.add(26);	hs.add(36);
		pc1.setObj(hs);
		pc1.printC(hs);
		ts.add(11);	ts.add(21);	ts.add(31);
		pc1.setObj(ts);
		pc1.printC(ts);
		
	}

}
