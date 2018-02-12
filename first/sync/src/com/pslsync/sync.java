package com.pslsync;

public class sync implements Runnable {
	Account ac;

	public sync(Account acc) {
		// TODO Auto-generated constructor stub
		ac = acc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				if (Thread.currentThread().getName().equals("one")) {
					synchronized (ac) {
						deposit(10000);
					}
				} else
					synchronized (ac) {
						withdraw(10000);
					}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void withdraw(int i) {
		// TODO Auto-generated method stub
		int ib = ac.getBalance();
		int fbal = ib - i;
		ac.setBalance(fbal);
		System.out.println("after withdraw:" + ac.getBalance());
	}

	private void deposit(int i) {
		// TODO Auto-generated method stub
		int ib = ac.getBalance();
		int fbal = ib + i;
		ac.setBalance(fbal);
		System.out.println("after deposit:" + ac.getBalance());
	}

	public static void main(String[] args) {
		Account acc = new Account(10000);
		sync s = new sync(acc);

		Thread t1 = new Thread(s, "one");
		Thread t2 = new Thread(s, "two");

		t1.start();
		//
		// try {
		// t1.join();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		t2.start();

	}
}
