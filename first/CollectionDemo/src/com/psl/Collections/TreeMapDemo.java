package com.psl.Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(3, "Prabhav");
		map.put(5, "Prabha");
		map.put(2, "Prabh");
		map.put(4, "Prabh");
		map.put(2, "Pra");
		System.out.println(map);

		System.out.println(map.get(3));

		Iterator<Integer> i = map.keySet().iterator();

		while (i.hasNext()) {
			Integer it =i.next();
			System.out.println(it + map.get(it));
		}
		
		Iterator it1=map.entrySet().iterator();
		
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
	//most widely used
		for(Entry<Integer, String> str:map.entrySet()){
			System.out.println(str.getKey()+str.getValue());
		}
	}
}
