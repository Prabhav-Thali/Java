package com.psl.Ques4;

import java.util.Map;
import java.util.TreeMap;

public class MapTree implements Comparable<MapTree> {
	int cityId;
	String cityName, cityInfo;

	public MapTree(String s1) {
		// TODO Auto-generated constructor stub

		cityName = s1;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cityName;
	}

	public static void main(String[] args) {
		MapTree m[] = new MapTree[args.length];

		TreeMap<Integer, MapTree> mt = new TreeMap<Integer, MapTree>();

		for (int i = 0; i < args.length; i++) {
			m[i] = new MapTree(args[i]);
		}

		for (int i = 1; i < args.length + 1; i++) {
			mt.put(i, m[i - 1]);
		}
		
	
	for(Map.Entry<Integer, MapTree> entry :mt.entrySet())
	{
		Integer s=entry.getKey();
		MapTree val=entry.getValue();
		//System.out.print(val);	
	}
		
	System.out.println(mt.descendingMap());
		System.out.println(mt);
		//System.out.println(mtt);
		System.out.println(mt.higherKey(4));

		System.out.println(mt.tailMap(3));

		System.out.println(mt.tailMap(2, true));
		mt.subMap(2, 6);

		
	}

	@Override
	public int compareTo(MapTree arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
