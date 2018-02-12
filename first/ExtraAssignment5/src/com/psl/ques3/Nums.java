package com.psl.ques3;

public class Nums {
	public static void main(String[] args) {
		int n = 11;
		if (n % 2 == 0) {
			if (n >= 2 && n < 6)
				System.out.println("even and betn 2 and 5");
			else if (n >= 6 && n <= 20)
				System.out.println("even and betn 6 and 20");
			else if (n > 20)
				System.out.println("greater then 20 and even");
		} else
			System.out.println("odd");

	}
}
