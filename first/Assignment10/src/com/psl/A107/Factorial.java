package com.psl.A107;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import com.psl.A102.Printer;
import com.psl.A102.Storage;

public class Factorial implements Runnable {

	public static void main(String[] args) {

		Factorial s = new Factorial();
		Thread t1 = new Thread(s, "number.txt");
		// Thread t2 = new Thread(s, "Factorial");

		t1.start();

	}

	@Override
	public void run() {

		// TODO Auto-generated method stub
		if (Thread.currentThread().getName().equals("number.txt")) {
			File f = new File(Thread.currentThread().getName());

			FileInputStream fis;

			try {
				fis = new FileInputStream(f);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						fis));
				String t;
				int n = 0;
				while ((t = br.readLine()) != null) {
					n = Integer.parseInt(t);
					// notify();
					// System.out.println(Integer.parseInt(t));
					Factorial f1 = new Factorial();
					Thread t2 = new Thread(f1, t);
					t2.start();

				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

			// System.out.println(Thread.currentThread().getName());
			long f = 1;
			for (int i = Integer.parseInt(Thread.currentThread().getName()); i > 0; i--) {
				f *= i;
			}
			System.out.println(f);

		}

	}

}
