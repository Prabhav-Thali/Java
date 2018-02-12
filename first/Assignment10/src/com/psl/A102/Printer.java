package com.psl.A102;

public class Printer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if (Thread.currentThread().getName().equals("Printing"))
			
			System.out.println("Printing newly stored value:"+Storage.c);
//		synchronized (this) {
//			notify();
//		}
	}

}
