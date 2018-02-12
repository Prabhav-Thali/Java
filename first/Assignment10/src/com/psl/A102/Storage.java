package com.psl.A102;

public class Storage {

	public static int c;

	
	public static void main(String[] args) {
		Storage s = new Storage();
		Counter c = new Counter();
		Thread t1 = new Thread(c, "Counting");
		t1.start();
		

	}
}
