package com.psl.Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	Set<String> obj=new TreeSet<String>();//if you want to get output which is not sorted use linked hashset
	
	obj.add("Prabhav");
	obj.add("Nishit");
	obj.add("Namrata");
	obj.add("Lerisa");
	obj.add("Sruthi");
	obj.add("Namrata");
	System.out.println(obj);
	
	for (String string : obj) {
		System.out.println(string);
	}
}
}
