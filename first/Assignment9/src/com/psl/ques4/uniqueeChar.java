package com.psl.ques4;

import java.util.TreeSet;

public class uniqueeChar {
	TreeSet<Character> ts = new TreeSet<Character>();

	public int count(String s) {
		for (int i = 0; i < s.length(); i++) {
			ts.add(s.charAt(i));
		}
		return ts.size();
	}

	public static void main(String[] args) {
		String str = "abassasasd";
		String str1 = "abassasasdabassasasdabassasasdabassasasdabassasasd";
		uniqueeChar uc = new uniqueeChar();
		System.out.println("number of unique characters in String " + str
				+ " are: " + uc.count(str));
		System.out.println("number of unique characters in String " + str1
				+ " are: " + uc.count(str1));
	}
}
