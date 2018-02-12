package com.psl.enumDemo;

public class enumDemo {
	public static void main(String[] args) {

		// System.out.println(coffee.small);
		coffee[] c = coffee.values();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]+" "+c[i].getPrice());
		}
		
		System.out.println(coffee.small+":" +coffee.small.getPrice());
	}
}
