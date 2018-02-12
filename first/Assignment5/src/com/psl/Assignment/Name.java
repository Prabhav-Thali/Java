package com.psl.Assignment;

import java.util.List;
import java.util.Vector;

public class Name {

	String firstName, surname;

	public Name(String fname, String sname) {
		// TODO Auto-generated constructor stub
		firstName = fname;
		surname = sname;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " " + firstName + " " + surname;
	}

	public static void main(String[] args) {

		List<Name> l = new Vector<Name>();

		Name n[] = new Name[5];
		n[0] = new Name("Prabhav", "Thali");
		n[1] = new Name("P", "kk");
		n[2] = new Name("Pa", "hh");
		n[3] = new Name("Pb", "Tt");

		int c = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == null)
				c--;

			l.add(n[i]);
			c++;
		}
		System.out.println("No of records in list:" + c);
		System.out.println("And those are:");
		for (int i = 0; i < c; i++)
			System.out.println(l.get(i));

		// String fullName=firstName+surname;
	}
}
