package com.psl.demo;

interface MyInterface {

	int operations(int a, int b);

}

public class LambdaTest {
	public static void main(String[] args) {
		MyInterface obj = new MyInterface() {
			@Override
			public int operations(int a, int b) {
				return a + b;
			}

		};
		obj.operations(10, 20);

		MyInterface obj1 = new MyInterface() {
			@Override
			public int operations(int a, int b) {
				return 0;
			}

		};

		MyInterface my = (int a, int b) -> a + b;
		MyInterface my1 = (a, b) -> a * b;
		MyInterface my2 = (int a, int b) -> {
			System.out.println("if multiple stmt den syntax is like dis");
			return a - b;
		};

		System.out.println(my.operations(20, 40));
		System.out.println(my1.operations(223, 4034));
		System.out.println(my2.operations(3430, 4054));
	}

}
