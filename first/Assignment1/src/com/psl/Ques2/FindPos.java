package com.psl.Ques2;

public class FindPos {

	static int findPosition(int num, int[] nos) {

		for (int no : nos) {
			if (num == no)
				return 1;

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nos = { 1, 2, 3, 4, 5 };
		int num = 10;
		int result = findPosition(num, nos);
		if (result == 1)
			System.out.println(num + " is Present");
		else
			System.out.println(num + " is Absent");

	}
}
