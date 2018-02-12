package com.psl.demo;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		try {
			return a / b;
		} catch (ArithmeticException e) {
			
			System.out.println("hello do no enter 0");
			return a;
		}

	}

	public static void main(String[] args) {

	}
}
