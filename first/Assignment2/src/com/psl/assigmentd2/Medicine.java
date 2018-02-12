package com.psl.assigmentd2;

public class Medicine {
	String n = "cipla", a = "Verna";

	public Medicine(String name, String address) {
		// TODO Auto-generated constructor stub
		n = name;
		a = address;
	}

	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Company name and address is as follows:" + n + ","
				+ a);

	}
}
