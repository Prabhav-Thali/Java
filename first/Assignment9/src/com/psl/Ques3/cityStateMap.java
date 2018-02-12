package com.psl.Ques3;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class cityStateMap {
	String city[] = new String[2];

	public cityStateMap(String city, String state) {
		// TODO Auto-generated constructor stub
		this.city[0] = city;
		this.city[1] = state;

	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(city);System.out.println("hashcodes"+result);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cityStateMap other = (cityStateMap) obj;
		for(int i=0;i<=1;i++)
		if (!Arrays.equals(city, other.city))
			return false;
		return true;
	}



	public static void main(String[] args) {

		Set<String[]> se = new HashSet<String[]>();
		cityStateMap csm[] = new cityStateMap[10];
		String str1;// List<String[]> l=new List<String[]>();
		File f = new File("citystate.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));

			for (int j = 0; (str1 = br.readLine()) != null; j++) {
				String[] str = str1.split(" ");
				csm[j] = new cityStateMap(str[0], str[1]);
				// System.out.println(csm[j].city[0]);

				se.add(str);

			}

			System.out.println("all cities:");
			for (Iterator iterator = se.iterator(); iterator.hasNext();) {
				String[] strings = (String[]) iterator.next();

				System.out.println(strings[0]);
			}

			System.out.println("all states:");
			for (Iterator iterator = se.iterator(); iterator.hasNext();) {
				String[] strings = (String[]) iterator.next();

				System.out.println(strings[1]);
			}

			
			String state = "goa";
			System.out.println("cities for a state" + state+":");
			for (Iterator iterator = se.iterator(); iterator.hasNext();) {
				String[] strings = (String[]) iterator.next();

				if (strings[1].equals(state)) {

					System.out.println(strings[0]);
				}
			}
			System.out.println("After adding new  pair:");
			String newPair = "Mumbai Maharastra";
			// csm[se.size()+1]=new cityStateMap(newCity, newState);
			String s[] = newPair.split(" ");
			csm[se.size() + 1] = new cityStateMap(s[0], s[1]);
			se.add(s);
			for (Iterator iterator = se.iterator(); iterator.hasNext();) {
				String[] strings = (String[]) iterator.next();
				for (int i = 0; i <= 1; i++) {
					System.out.print(strings[i]);
					System.out.print(" ");
				}
				System.out.println("\n");
			}

			
			String state1 = "goa";
			System.out.println("After Deleting cities for state " + state1+":");
			for (Iterator iterator = se.iterator(); iterator.hasNext();) {
				String[] strings = (String[]) iterator.next();
				
				if (strings[1].equals(state1)) {
				
					strings[0]="";
				}
			}
			for (Iterator iterator = se.iterator(); iterator.hasNext();) {
				String[] strings = (String[]) iterator.next();
				for (int i = 0; i <= 1; i++) {
					System.out.print(strings[i]);
					System.out.print(" ");
				}
				System.out.println("\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
