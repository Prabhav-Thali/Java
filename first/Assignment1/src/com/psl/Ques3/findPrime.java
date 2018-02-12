package com.psl.Ques3;

public class findPrime {

	int[] findP(int a, int b) {
		int n, i, c = 0;
		int[] prime = new int[100];
		for (n = a + 1; n < b; n++) {
			for (i = 2; i < n; i++)
				if (n % i == 0)
					break;
			if (i == n)
				prime[c++] = n;

		}
		return prime;

	}

	public static void main(String[] args) {
		findPrime fp = new findPrime();
		int p[] = new int[100];
		int a = 1, b = 18;
		p = fp.findP(a, b);
		System.out.println("Prime Numbers between " + a + " and " + b);
		for (int j = 0; j < p.length; j++) {
			if (p[j] != 0)
				System.out.println(p[j]);

		}

	}
}