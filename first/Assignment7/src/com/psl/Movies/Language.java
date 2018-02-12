package com.psl.Movies;

public enum Language {// constant are first in enums
	English(1), Hindi(2), Marathi(3);
	int value;

	private Language(int i) {
		value = i;
		// TODO Auto-generated constructor stub
	}
}
