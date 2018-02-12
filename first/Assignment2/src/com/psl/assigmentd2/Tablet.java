package com.psl.assigmentd2;

public class Tablet extends Medicine {
	int p = 0;
	String tabletName;

	public Tablet(String name, String address, String tabletName, int price) {
		super(name, address);
		// TODO Auto-generated constructor stub
		p = price;
		this.tabletName = tabletName;
	}

	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		super.displayLabel();
		System.out.println("Tablet Details are:" + tabletName + " " + p);
	}
}
