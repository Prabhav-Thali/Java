package com.psl.ddate;

public class DispDate { // to display date
	private int date, month, year;

	/*
	 * private void initDate() { // TODO Auto-generated method stub date = 10;
	 * month = 9; year = 2017; }
	 */
	public DispDate() {
		// TODO Auto-generated constructor stub
		this(7,2007);
		date = 10;
		
	}

	public DispDate(int month, int year) {
		// TODO Auto-generated constructor stub
		// this.date = date;
		//this();
		this.month = month;
		this.year = year;
	}

	private void displayDate() {
		// TODO Auto-generated method stub
		System.out.println("Today's date is: " + date + " : " + month + " : "
				+ year);
	}

	public static void main(String[] args) {
		DispDate obj;// reference
		obj = new DispDate(2, 2002);// object

		// obj.initDate();
		obj.displayDate();

	}
}
