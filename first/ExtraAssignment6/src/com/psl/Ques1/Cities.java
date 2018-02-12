package com.psl.Ques1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cities {
	int cityId;
	String cityName, cityInfo;

	public Cities(int c, String s1, String s2) {
		// TODO Auto-generated constructor stub
		cityId = c;
		cityName = s1;
		cityInfo = s2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "City info is:" + cityId + " " + cityName + " " + cityInfo;
	}

	public static void main(String[] args) {
		int i, j;
		Cities c[] = new Cities[(args.length / 3)];
		for (i = 0, j = 0; i < args.length; i += 3) {
			c[j++] = new Cities(Integer.parseInt(args[i]), args[i + 1],
					args[i + 2]);
		}
		List<Cities> cn = new ArrayList<Cities>();

		System.out.println("1st method:Using function get()");
		for (i = 0; i < j; i++) {
			cn.add(c[i]);
			System.out.println(cn.get(i));
		}

		System.out.println("2nd method:Printing Object");
		System.out.println(cn);

		System.out.println("3rd method:USing Iterator");

		for (Iterator<Cities> iterator = cn.iterator(); iterator.hasNext();) {
			Cities cities = (Cities) iterator.next();
			System.out.println(cities);

		}
int size=cn.size();
		for (int k = 0; k <size;k++ ) {
			cn.remove(0);
		}
		System.out.println("After Removing:"+cn);

	}
}
