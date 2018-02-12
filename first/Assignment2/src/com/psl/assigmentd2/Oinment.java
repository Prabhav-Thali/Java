package com.psl.assigmentd2;

public class Oinment extends Medicine {
	String use, oinName;

	public Oinment(String name, String address, String oinName, String usage) {
		super(name, address);
		// TODO Auto-generated constructor stub
		use = usage;
		this.oinName = oinName;
	}

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		super.displayLabel();
		System.out.println("Oinment details are:" + oinName + " " + use);

	}
}
