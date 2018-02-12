package com.psl.enumDemo;

public enum coffee {//constant are first in enums
	small(50), regular(80), large(100);
	int price;
	private coffee(int p) {
		// TODO Auto-generated constructor stub
		price =p;
	}
public int getPrice() {
	// TODO Auto-generated method stub
return price;
}
}
