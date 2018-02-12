package com.psl.A101;

import com.psl.A10.hpThread;

public class SleepThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub

		if(Thread.currentThread().getPriority()==10){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("runnning "+Thread.currentThread().getName());
		}
		else {
			System.out.println("runnning "+Thread.currentThread().getName());
			
		}
	
		
	}

	public static void main(String[] args) {
		SleepThread h1 = new SleepThread();
		// hpThread h2=new hpThread();

		Thread t1 = new Thread(h1, "one");
		Thread t2 = new Thread(h1, "two");

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();

	}
}
