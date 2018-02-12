package com.psl.Ques5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Phonebook {
	String name, number;
	static Map<String, String> m = new HashMap();

	public Phonebook(String num, String n) {
		// TODO Auto-generated constructor stub
		m.put(num, n);

	}

	public void search(String na) {
		// TODO Auto-generated method stub
		if (m.containsValue(na)) {
			for (Entry<String, String> entry : m.entrySet()) {
				if (na.equals(entry.getValue())) {
					System.out.println("number for:" + na + " is:"
							+ entry.getKey());
				}
			}
		}
	}

	public static void main(String[] args) {

		Phonebook p = new Phonebook("1212212", "Nishit");
		Phonebook p1 = new Phonebook("12343", "Ndsdsd");
		Phonebook p2=new Phonebook("2343","APs");
		p.search("APs");

	}
}
