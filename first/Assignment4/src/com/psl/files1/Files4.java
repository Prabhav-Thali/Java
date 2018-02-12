package com.psl.files1;

public class Files4 {
	static String makeReverse(String str) {
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--)
			str1 += str.charAt(i);

		return str1;
	}

	public static void main(String[] args) {

		String str = "hi hello how are you";
		String str1 = makeReverse(str);
		System.out.println(str1);
	}
}
