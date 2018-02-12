package com.psl.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class DeserializationDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, 10000, "JamesBond");
		File f = new File("Test.ser");
		if (f.exists()) {
			System.out.println("exists");
		} else {
			System.out.println("doesnt");
		}

		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream ooi = new ObjectInputStream(fi);
			Employee e2 = (Employee) ooi.readObject();
	
			System.out.println(e2);
			ooi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
