package com.psl.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class deArrDemo {

	public static void main(String[] args) {
		Deque<Integer> deque=new ArrayDeque<Integer>();
		
		deque.add(40);
		deque.add(50);
		deque.add(60);
		deque.add(70);
		deque.add(80);
		deque.add(10);
		
		
		
		deque.addFirst(5);
		
	System.out.println(deque.peekLast());	
	
	Iterator<Integer> itr=deque.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println("sdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsddsdsd");
	Iterator<Integer> desc=deque.descendingIterator();
	while(desc.hasNext()){
		System.out.println(desc.next());
	}
	}
	
}
