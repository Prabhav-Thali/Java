package com.psl.Ques2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListLinked {
	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < args.length; i++)
			l.add(Integer.parseInt(args[i]));

		System.out.println("Adding 10 to 1st position");
		l.addFirst(10);
		System.out.println(l);

		l.removeLast();
		System.out.println("After removing last element");
		System.out.println(l);

		System.out.println("!st element:"+l.element());

	}

}
