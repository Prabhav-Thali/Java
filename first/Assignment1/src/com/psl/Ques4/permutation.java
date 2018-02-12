package com.psl.Ques4;

public class permutation {

	static int[] combinations(int[] input) {
		int n = 3;
		int k[] = input;
		for (int i = 0; i < n; i++) {

			int t = k[0];
			k[0] = k[1];
			k[1] = t;
			display(k);

			for (int c = 2; c >= 0;) {
				int t2 = k[c];
				k[c] = k[2 - c];
				k[2 - c] = t2;
				display(k);
				break;
			}

		}
		return k;
	}

	static void display(int[] k) {
		for (int j = 0; j < 3; j++)
			System.out.println(k[j]);
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int ip[] = new int[3];
		ip[0] = 1;
		ip[1] = 2;
		ip[2] = 3;
		combinations(ip);
	}
}
