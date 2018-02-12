package com.psl.A102;

public class Counter implements Runnable {


@Override
public void run() {
	// TODO Auto-generated method stub
	if(Thread.currentThread().getName().equals("Counting")){try {
		Thread.sleep(50);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		for(int i=0;i<100;i++){
		
		synchronized(this){
			Printer p = new Printer();
			Thread t2 = new Thread(p, "Printing");

			t2.start();
			try {
				wait(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Storage.c++;
		}
	}
	
}


}

