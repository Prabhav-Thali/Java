package com.psl.vehicle;

import com.psl.interfaceDemo.Abc;
import com.psl.interfaceDemo.Printable;

public class Fwheeler implements Printable,Abc {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Audi R8");
		
	}

	@Override
	public void acting() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Acting");
		
	}

	
}
