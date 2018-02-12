package com.psl.ThreadDemo;

public class ThreadDemo extends Thread implements Runnable {
	@Override
	public  void run()  {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
	
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (Thread.currentThread().getName().equals("one")) {
				// System.out.println("one" +
				// Thread.currentThread().getPriority());
				System.out.println("one" + 3 * i);
			} else {
				// System.out.println("two" +
				// Thread.currentThread().getPriority());
				System.out.println("two" + 5 * i);
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
System.out.println(Thread.activeCount());
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		//
		// Thread t3[] = new Thread[5];
		// t3[0].setName("sdsd");

		// t1.run();//prints main without creating thread as it doesnt execute
		// runnable
		t1.setName("one");

		t2.setName("two");
		System.out.println("B4 start");
		// t1.setPriority(10);
		// t2.setPriority(2);
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("after start");
		 if (!t2.isAlive()) {
		 t2.start();
		 }

		System.out.println("End Main");
	}
}
