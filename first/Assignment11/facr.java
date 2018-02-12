package com.a10;
//NOT WORKING
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class facr implements Runnable {
	Boolean read;
	int n;

	public static void main(String[] args) {

		facr s = new facr();
		Thread t1 = new Thread(s, "number.txt");

		Thread t2 = new Thread(s, "fact");

		t1.start();
		t2.start();
	}

	@Override
	public void run() {

		// TODO Auto-generated method stub
		if (Thread.currentThread().getName().equals("number.txt")) {
			read();
		} else {
			fact();
		}
	}

	public synchronized void read() {

		File f = new File(Thread.currentThread().getName());

		FileInputStream fis;

		try {
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String t;
			// int n = 0;
			while ((t = br.readLine()) != null) {
				n = Integer.parseInt(t);
				read = true;
				notify();

				wait();

				// System.out.println(Integer.parseInt(t));

			}
			notify();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void fact() {

		// System.out.println(Thread.currentThread().getName());
		long f = 1;
		if (read == true) {
			for (int i = n; i > 0; i--) {
				f *= i;
			}
			System.out.println(f);
			// notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		notify();

	}

}
