package com.psl.EA81;

import java.io.File;
import java.util.ArrayList;

public class CustomerBill {

	private String CustomerName;
	private String travelMonth;
	private double packages;
	private double food;

//	public CustomerBill(String n, String month, double pack, double fp) {
//		CustomerName = n;
//		travelMonth = month;
//		packages = pack;
//		food = fp;
//		// TODO Auto-generated constructor stub
//	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getTravelMonth() {
		return travelMonth;
	}

	public void setTravelMonth(String travelMonth) {
		this.travelMonth = travelMonth;
	}

	public double getPackages() {
		return packages;
	}

	public void setPackages(double packages) {
		this.packages = packages;
	}

	public double getFood() {
		return food;
	}

	public void setFood(double food) {
		this.food = food;
	}

	public static void main(String[] args) {

	}
}
