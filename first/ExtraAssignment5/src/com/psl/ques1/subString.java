package com.psl.ques1;

public class subString {
	static void display(String str, int a1, int b1) {
		System.out.println("Substring of string' "+str+" 'from "+a1+" to "+b1+" is:" );
		for (int i = a1; i <= b1; i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[1]);
		int num2 = Integer.parseInt(args[2]);
		String s = new String(args[0]);
		display(s, num1, num2);
	}
}
