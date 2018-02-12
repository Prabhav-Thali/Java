package com.psl.EA82;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestGrocery {

	public static int k = 0;

	
	public static void main(String[] args) {
		DatabaseFunction d=new DatabaseFunction();
		TestGrocery tg = new TestGrocery();
		File f = new File("Grocery.txt");
		FileInputStream fis = null;
		String str, temp[] = null, type[], name[];

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						fis));
				while ((str = br.readLine()) != null) {
					temp = str.split(",");
					type = temp[1].split("\"");
					name = temp[2].split("\"");
					// Store.addGrocery(Integer.parseInt(temp[0]),type[1],
					// name[1],
					// Integer.parseInt(temp[3]),
					// Float.parseFloat(temp[4]));

				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Person p[] = new Person[4];
			int j = 0;
			int w1 = 0;
			File f2 = new File("order.txt");
			FileInputStream fis1 = null;
			String stri, temp1[], semicolon[], type1[], part[], commas[] = null;

			if (f.exists()) {

				try {
					fis1 = new FileInputStream(f2);
					BufferedReader br = new BufferedReader(
							new InputStreamReader(fis1));
					while ((stri = br.readLine()) != null) {
						part = stri.split(":");
						temp1 = part[0].split(",");
						p[w1] = new Person();
						p[w1].personID = k++;
								 p[w1].personName = temp1[0];
								 p[w1].personTelephone = Long
								 .parseLong(temp1[1]);
						 type = temp[1].split("\"");
//						 p[w1].addPerson(
//						 p[w1].personID ,
//						 p[w1].personName ,
//						 p[w1].personTelephone);
						semicolon = part[1].split(";");
						// System.out.println(semicolon[w1]);
						for (int i = 0; i < semicolon.length;i++) {
							commas = semicolon[i].split(",");
							p[w1].m.put(commas[0],
									Float.parseFloat(commas[ 1]));
							
						}
						p[w1].generateBill();
					}// w1++;
					Scanner sc=new Scanner(System.in);
					
					System.out.println("enter the name of person to be searched:");String n=sc.next();
					Person p1=new Person();
					p1.search(n);
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
