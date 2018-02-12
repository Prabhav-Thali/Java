package com.psl.ques5;

public class Adder extends Arithmetic {
	public static void main(String[] args) {
		int[] a1 = new int[args.length];
		for (int j = 0; j < a1.length; j++)
			a1[j] = Integer.parseInt(args[j]);

		System.out.println("Sum is " + add(a1));
	}
}
