package com.psl.ques5;

public class Arithmetic {

	protected static int add(int... a) {
		int sum = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
