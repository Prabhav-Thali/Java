package com.psl.ques2;

public class Anagrams {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int i, f = 0, j = 0;
		String a = args[0];
		System.out.println(a);
		char a1[] = a.toCharArray();
		String b = args[1];
		System.out.println(b);
		char[] b1 = new char[args[0].length()];

		for (i = 0; i < a.length(); i++) {

			for (j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					b1[i] = b.charAt(j);
					StringBuilder sb = new StringBuilder(b);
					sb.setCharAt(j, ' ');
					b = sb.toString();
					break;
				}

			}
		}
	for(int k=0;k<b1.length;k++)
			if (a1[k]==b1[k])
				f++;
			else
				f--;

		
		if (f == b1.length) {
			System.out.println("Strings are Anagrams");
		} else
			System.out.println("String are not Anagrams");

	}
}
