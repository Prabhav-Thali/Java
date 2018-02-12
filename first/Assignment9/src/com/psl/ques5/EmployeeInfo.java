package com.psl.ques5;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;

public class EmployeeInfo implements Serializable {
	private int id;
	private String name;
	private Date jDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getjDate() {
		return jDate;
	}

	public void setjDate(Date jDate) {
		this.jDate = jDate;
	}

	public static void main(String[] args) {
		EmployeeInfo e[] = new EmployeeInfo[3];
		for (int i = 0; i < e.length; i++) {
			e[i] = new EmployeeInfo();
		}
		e[0].setId(112);
		e[0].setName("abc");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		e[1].setId(152);
		e[1].setName("xyz");

		e[2].setId(153);
		e[2].setName("pqr");
		try {
			e[0].setjDate(sdf.parse("22/09/2017"));
			e[1].setjDate(sdf.parse("19/04/2017"));
			e[2].setjDate(sdf.parse("22/1/2008"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("ALl Employees:");
		for (int i = 0; i < e.length; i++) {
			System.out.print("Employee id:" + e[i].getId() + " Employee Name: "
					+ e[i].getName() + " Joining Date is: ");
			Date d = e[i].getjDate();
			System.out.print(sdf.format(d));
			System.out.println();
		}

		Date d = null;
		try {
			d = sdf.parse("23/01/2009");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Employeees joined before:" + sdf.format(d));
		for (int i = 0; i < e.length; i++) {
			if ((e[i].getjDate().compareTo(d)) <= -1) {
				System.out.print("Employee id:" + e[i].getId()
						+ " Employee Name: " + e[i].getName()
						+ " Joining Date is: " + sdf.format(e[i].getjDate()));

			}
		}

		Date endDate = new Date();

		System.out.println("\nEmployeees who have completed 6 months on:"
				+ sdf.format(endDate));
		for (int j = 0; j < e.length; j++) {
			Calendar startCalendar = new GregorianCalendar();

			startCalendar.setTime(e[j].jDate);
			Calendar endCalendar = new GregorianCalendar();
			endCalendar.setTime(endDate);

			int diffYear = endCalendar.get(Calendar.YEAR)
					- startCalendar.get(Calendar.YEAR);
			int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH)
					- startCalendar.get(Calendar.MONTH);

			if (diffMonth >= 6) {

				System.out.print("Employee id:" + e[j].getId()
						+ " Employee Name: " + e[j].getName()
						+ " Joining Date is: " + sdf.format(e[j].getjDate()));
				System.out.println();

			}

		}

	}
}
