package com.psl.A106;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;



public class ThreadFiles implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		File f = new File(Thread.currentThread().getName());
		FileInputStream fis;

		try {
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String s;int t=0;
			while ((s = br.readLine()) != null) {
				System.out.println(Thread.currentThread().getName()+" : "+s);
			Thread.sleep((long) (Math.random()*2000));
			}
		
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

	public static void main(String[] args) {

		ThreadFiles s = new ThreadFiles();
		Thread t1 = new Thread(s, args[0]);
		Thread t2 = new Thread(s, args[1]);
	

		t1.start();
		t2.start();
		
	}
	
	
	
}
