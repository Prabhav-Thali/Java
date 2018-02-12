package com.psl.assigmentd2;

public class Syrup extends Medicine {
	String store, sName;

	public Syrup(String name, String address, String syrupName, String storage) {
		super(name, address);
		// TODO Auto-generated constructor stub
		store = storage;
		sName = syrupName;
	}

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		super.displayLabel();
		System.out.println("Syrup details are:" + sName + " " + store);
	}
}
