package com.psl.Collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collection {
	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();// List as base class
													// reference rather then
													// arraylist and derived
													// type object
		//and to skip concurrent modificn use copyonwriteArraylist
		obj.add("Prabhav");
		obj.add("Nishit");
		obj.add("Namrata");
		obj.add("Lerisa");
		obj.add("Sruthi");
		obj.add("Namrata");

		System.out.println(obj);
		// System.out.println(obj.get(i));
		//obj.remove(5);
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i));
		}

		for (String string : obj) {
			System.out.println(string);

		}
String str;
		Iterator<String> i = obj.iterator();
		while (i.hasNext()) {
			str=i.next();
			System.out.println("\n "+str);
			if(str.equals("Namrata")){
				obj.remove("Namrata");
			}
			/*if(i.next().equals("Namrata")){
				obj.remove("Namrata");
			}*/
			if(str.equals("prabhav")){
				i.remove();
			}
			
			//i.remove();
			//System.out.println("\n "+i.next());
			
		}
		//System.out.println("\n "+obj);
	}
}
