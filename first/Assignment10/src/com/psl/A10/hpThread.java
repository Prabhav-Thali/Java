package com.psl.A10;

public class hpThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub

		if(Thread.currentThread().getName().equals("one")){
			System.out.println("runnning one");
		}
		else if(Thread.currentThread().getName().equals("two")){
			System.out.println("runnning two");
			
		}
		else
			System.out.println("main!!!!");
		
	}

	public static void main(String[] args) {
		hpThread h1 = new hpThread();
		// hpThread h2=new hpThread();

		Thread t1 = new Thread(h1, "one");
		Thread t2 = new Thread(h1, "two");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

	}

}
