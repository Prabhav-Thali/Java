package com.psl.EA81;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;

public class Customer {

	ArrayList<CustomerBill> ct = new ArrayList<CustomerBill>();
	CustomerBill cb[] = new CustomerBill[5];

	public static void main(String[] args) {
		ArrayList<CustomerBill> cl = new ArrayList<CustomerBill>();
		Customer c = new Customer();

		cl = c.getCustomerDetails("customer.txt");

		c.calculateDiscount(cl);

	}

	boolean isDouble(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	void calculateDiscount(ArrayList<CustomerBill> cl) {
		double discount = 0;
		for (Iterator iterator = cl.iterator(); iterator.hasNext();) {
			CustomerBill customerBill = (CustomerBill) iterator.next();
			// System.out.println(customerBill.getCustomerName());

			switch (customerBill.getTravelMonth()) {
			case "April":
			case "May":
			case "June":
			case "July":
			case "August":
				discount = customerBill.getPackages() * 0.3
						+ customerBill.getFood() * 0.2;
				break;
			case "September":
			case "October":
			case "February":
			case "March":
				discount = customerBill.getPackages() * 0.2
						+ customerBill.getFood() * 0.1;
				break;
			case "January":
			case "November":
				discount = customerBill.getPackages() * 0.1
						+ customerBill.getFood() * 0.05;
				break;
			case "December":
				discount = 0;
				break;
			default:
				System.out.println("default");
			}
			System.out.println("GoGio Travels");
			System.out.println("Name: " + customerBill.getCustomerName());
			System.out.println();
			System.out.println("Package Cost:       "
					+ customerBill.getPackages());
			System.out.println("food:               " + customerBill.getFood());
			System.out.println("Discount:           " + discount);
			for (int i = 0; i < 50; i++) {
				System.out.print("_");
			}
			System.out
					.println("\nnet Payable amount: "
							+ (customerBill.getPackages()
									+ customerBill.getFood() - discount));
		}

	}

	ArrayList<CustomerBill> getCustomerDetails(String fileName) {
		File f = new File(fileName);
		FileInputStream fis = null;
		String str;
		String temp[] = null;
		try {

			if (f.exists()) {
				fis = new FileInputStream(f);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						fis));
				int i = 0;
				while ((str = br.readLine()) != null && i < 5) {
					temp = str.split(",");
					if (temp[2].equals("") || temp[3].equals(" ")) {
						throw new noDataFound();
					} else if (!isDouble(temp[2]) || !isDouble(temp[3])) {
						throw new invalidData();
					} else {
						cb[i] = new CustomerBill();
						cb[i].setCustomerName(temp[0]);
						cb[i].setTravelMonth(temp[1]);
						cb[i].setPackages(Double.parseDouble(temp[2]));
						cb[i].setFood(Double.parseDouble(temp[3]));
						ct.add(cb[i]);
						i++;
					}

				}
			}
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (noDataFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (invalidData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ct;

	}

}
