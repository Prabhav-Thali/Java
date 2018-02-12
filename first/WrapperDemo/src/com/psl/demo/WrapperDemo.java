package com.psl.demo;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		Integer i = new Integer(a);
		System.out.println(i);

		int a1 = i.intValue();
		System.out.println(a1);

		Integer i1 = a; // Autoboxing-without creating new objecting by using
						// new()
		System.out.println(i1);

		int a2 = i1;//autounboxing
		
		String str = "10";
		System.out.println(str + 10);
		int a3 = Integer.parseInt(str);
		System.out.println(a3);
		
		String str1=String.valueOf(a3);

	}
}
