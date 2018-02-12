package com.psl.DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();

		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.UK);

		String str = sdf.format(d);

		System.out.println(str);

		sdf.setLenient(false);
		Date d1 = null;
		try {
			d1 = sdf.parse("07/12/2007");
			System.out.println(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		/*
		 * Calendar c=Calendar.getInstance(); System.out.println(c);
		 */

		Calendar c = new GregorianCalendar();

		c.setTime(d1);

		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));

		c.set(Calendar.DAY_OF_MONTH, 23);

		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));

		c.add(Calendar.DAY_OF_MONTH, 10);
		// c.set(Calendar.MONTH,12);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));

		Date d2 = c.getTime();
		
		System.out.println(d2);


		java.sql.Date sqld = new java.sql.Date(d2.getTime());
		System.out.println(sqld);

	}
}
