package com.psl.employee;

import com.psl.interfaceDemo.Abc;
import com.psl.interfaceDemo.Printable;

public class Dev implements Printable,Abc {

	@Override
	public void print() {
		// TODO Auto-generated method stub
System.out.println("hey, you");
	}

	@Override
	public void acting() {
		// TODO Auto-generated method stub
		System.out.println("Dev Acting");
	}

}
