package com.psl.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques1 {
	public static void main(String[] args) {
		List<String> student = new ArrayList<String>();

		student.add("Rahul");
		student.add("Rohan");
		student.add("abc");

		String str, name = "Rahul";
		Iterator<String> i = student.iterator();
		while (i.hasNext()) {
			str = i.next();
			if (name.equals(str)) {
				System.out.println("Name Found:" + name);
				break;
			}

		}
	}
}
