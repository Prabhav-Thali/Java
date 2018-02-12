package com.psl.exceptionDemo;

public class Exceptions {
	private void display() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		int result, a = 10, b = 1;
		Exceptions demo = null;
		try {
			result = a / b;// if exception occurs it internally creates a object
							// and throws

			System.out.println("Result is:" + result);
			demo.display();
		} catch (ArithmeticException|NullPointerException e) {
			// e.printStackTrace();
			System.out.println("Hey ,you cannot divide by 0");
			b = 4;
			result = a / b;
			System.out.println("Result is:" + result);
//		} catch (NullPointerException e) {
//			// e.printStackTrace();
//			System.out.println("Nullpointer");
//			Exceptions demo1 = new Exceptions();
//			demo1.display();
//		} catch (Exception e) {
			System.out.println("Try Again");
		}

		// System.out.println("Result is:" + result);
		System.out.println("all looks good");
	}
}
