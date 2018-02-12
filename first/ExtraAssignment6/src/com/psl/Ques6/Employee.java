package com.psl.Ques6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class Employee extends Dob {

	int employee_ID;
	String employee_Name;
	long employee_Telephone;
	Date employee_DOJ;
	int diff;
	static ArrayList<Integer> lc = new ArrayList<Integer>();

	public Employee(int id, String name, long tele, Date doj) {

		employee_ID = id;
		employee_Name = name;
		employee_Telephone = tele;
		employee_DOJ = doj;

		// TODO Auto-generated constructor stub
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void search(Dob d[], Employee e[], String m) {
		// Date dob = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 0; i < d.length; i++) {
			if (m.equals(d[i].month)) {
				// dob = sdf.parse(Integer.toString(d[i].day) + d[i].month
				// + d[i].year);
				System.out.println("Employees birthday in month:" + m + "id: "
						+ e[i].employee_ID + "Name: " + e[i].employee_Name
						+ " Contact no: " + e[i].employee_Telephone + " DOJ:"
						+ sdf.format(e[i].employee_DOJ));

			}
		}

	}

	public void experience(Employee e) {
		Date d = new Date();
		Date d1 = e.employee_DOJ;

		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		
		c.setTime(d);
		c1.setTime(d1);

		

	
		int diffYear = c.get(Calendar.YEAR)
				- c1.get(Calendar.YEAR);
		int diffMonth = diffYear * 12 + c.get(Calendar.MONTH)
				- c1.get(Calendar.MONTH);
		e.diff = diffMonth;
		System.out.println("Experience in months:" + diff);

		lc.add(e.diff);
	

		

	}

	public static void main(String[] args) {

		Employee e[] = new Employee[3];
		Dob d[] = new Dob[3];
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			e[0] = new Employee(1, "Nishhit", 343434, sdf.parse("01/11/2017"));
			e[1] = new Employee(2, "Nishhds", 34345656, sdf.parse("12/12/2015"));
			e[2] = new Employee(3, "Nisdsdsdhhit", 3456564,
					sdf.parse("11/11/2014"));
			d[0] = new Dob(11, "February", 2000);
			d[1] = new Dob(12, "March", 2000);
			d[2] = new Dob(11, "February", 2000);

		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (int i = 0; i < e.length; i++) {
			e[i].experience(e[i]);
		}

		Employee e1 = new Employee();

		e1.search(d, e, "February");

		Collections.sort(lc);
		for (Iterator iterator = lc.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
		}
		
		

			for(int j=lc.size()-1;j>=0;j--){
			for (int i = 0; i < e.length; i++)
				if ((e[i].diff) == lc.get(j)) {
					System.out.println("id: " + e[i].employee_ID + "Name: "
							+ e[i].employee_Name + " Contact no: "
							+ e[i].employee_Telephone + " DOJ:"
							+ sdf.format(e[i].employee_DOJ) + "Experience: "
							+ e[i].diff);
				}
			}
		

	}

}
