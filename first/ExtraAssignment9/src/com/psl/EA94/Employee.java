package com.psl.EA94;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class Employee extends Person implements Serializable {
	int id, empSalary;

	public static void main(String[] args) {
		ArrayList<Employee> earr = new ArrayList<Employee>();
		Employee e[] = new Employee[2];

		File f = new File("abc.ser");

		for (int i = 0; i < e.length; i++) {
			e[i] = new Employee();
			Scanner sc = new Scanner(System.in);
			System.out.println("Name:");
			e[i].Name = sc.nextLine();
			System.out.println("Address");
			e[i].Address = sc.nextLine();

			System.out.println("id:");
			e[i].id = sc.nextInt();

			System.out.println("Salary:");
			e[i].empSalary = sc.nextInt();

			System.out.println("Date:");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				e[i].DateOfBirth = sdf.parse(sc.next());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			System.out.println("objects are being stored in the file");

			earr.add(e[i]);
		}
		FileOutputStream fos;
		ObjectOutputStream oi;
		try {
			fos = new FileOutputStream(f);
			oi = new ObjectOutputStream(fos);
			oi.writeObject(earr);
			oi.flush();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FileInputStream fis;
		ObjectInputStream oo;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			fis = new FileInputStream(f);
			oo = new ObjectInputStream(fis);

			ArrayList<Employee> earr1 = new ArrayList<Employee>();
			// Employee e2 = new Employee();
			earr1 = (ArrayList<Employee>) oo.readObject();
			for (Iterator iterator = earr1.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
				System.out.println(employee.Address + " " + employee.id + " "
						+ employee.Name + " "
						+ sdf.format(employee.DateOfBirth));
			}

			oo.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
