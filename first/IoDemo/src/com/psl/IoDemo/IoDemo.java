package com.psl.IoDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IoDemo {
	public static void main(String[] args) {
		File f = new File("Test.txt");

		if (f.exists()) {
			System.out.println("File Exists...!");
		} else {
			System.out.println("doesnt exist");
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// System.out.println(f.getAbsolutePath());
		// System.out.println(f.getPath());//relative path from your project
		// System.out.println(f.canRead());
		// System.out.println(f.canWrite());

		String str = "Write this ,to the file...BaadShah";
		byte[] b = str.getBytes();

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			fos.write(b);
			System.out.println("done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileInputStream fi = null;
		try {
			fi = new FileInputStream("Test.txt");
			Scanner sc=new Scanner(fi);
			sc.useDelimiter(",");
			while(sc.hasNext()){
				System.out.println(sc.next());
			}
//BufferedReader br=new BufferedReader(new InputStreamReader(fi));
//String str1=br.readLine();
//System.out.println(str1);
			/*int i = 0;
			while ((i = fi.read()) != -1)
				System.out.print((char) i);*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
