package com.psl.EA101;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class EA1 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		File f = new File("hi.txt");
		FileInputStream fis;

		try {
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String s;int t=0;
			while ((s = br.readLine()) != null) {
				if (s.contains(Thread.currentThread().getName()))
					t=1;
			
			}
			if(t==1){
				System.out.println(Thread.currentThread().getName()
						+ " is present in the file");
				
			}
			else
				System.out.println(Thread.currentThread().getName()
						+ " is absent in the file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		EA1 s = new EA1();
		Thread t1 = new Thread(s, args[0]);
		Thread t2 = new Thread(s, args[1]);
		Thread t3 = new Thread(s, args[2]);
		Thread t4 = new Thread(s, args[3]);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

