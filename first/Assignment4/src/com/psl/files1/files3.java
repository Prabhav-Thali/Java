package com.psl.files1;

public class files3 {
	static int check(String sentence, String word) {
		int c = 0, len = word.length();
		int i = 0;
		while (sentence.contains(word)) {
			i = sentence.indexOf(word);
			if (i >= 0)
				c++;

			sentence = sentence.substring(i + len);
		}

		return c;
	}

	public static void main(String[] args) {
		String sentence = "hi hello hi hello i am hello here";
		String word = "hello";

		int i = check(sentence, word);
		System.out.print("no. of occurances of word " + word + " are " + i);
	}
}
