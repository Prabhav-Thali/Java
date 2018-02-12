package com.psl.EA3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Contact implements Serializable,Comparable {

	int contactID;
	String ContactName;
	String emailA;
	List<String> contactNumber = new ArrayList<String>();

	void addContact(Contact contact, List<Contact> contacts) {
		contacts.add(contact);
//		for (Iterator iterator = contacts.iterator(); iterator.hasNext();) {
//			Contact contact1 = (Contact) iterator.next();
//			System.out.println(contact1.contactID);
//		}
	}

	List<Contact> RemoveContact(Contact contact, List<Contact> obj)
			throws ContactNotFoundException {
		obj.remove(contact);
		return obj;
	}

	Contact searchContactByName(String name, List<Contact> contact)
			throws ContactNotFoundException {
		Contact c3 = new Contact();
		for (Iterator iterator = contact.iterator(); iterator.hasNext();) {
			Contact contact2 = (Contact) iterator.next();
			System.out.println(contact2.ContactName);
			if (contact2.ContactName.equals(name)) {
				//System.out.println(contact2.ContactName);
				return contact2;
			}
		}
		return null;

	}

	List<Contact> SearchContactByNumber(String number, List<Contact> contact)
			throws ContactNotFoundException {
		Contact c = new Contact();
		List<Contact> obj2 = new ArrayList<Contact>();
		for (Iterator iterator = contact.iterator(); iterator.hasNext();) {
			Contact contact2 = (Contact) iterator.next();// System.out.println(contact2.contactNumber);
			for (Iterator iterator2 = contact2.contactNumber.iterator(); iterator2
					.hasNext();) {
				String contact3 = (String) iterator2.next();
				if (contact3.equals(number)) {
					System.out.println(contact2.contactNumber);
					obj2.add(contact2);
					return obj2;
				}
			}

		}
		return null;

	}

	public void addContactNumber(int contactId, String contactNo,
			List<Contact> contacts) {

		for (Iterator iterator = contacts.iterator(); iterator.hasNext();) {
			Contact contact = (Contact) iterator.next();
			if (contact.contactID == contactId)
				contact.contactNumber.add(contactNo);

		}
	}

	void serializeContactDetails(List<Contact> contacts, String filename) {

		File f = new File(filename);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileOutputStream fos;
		try {
			fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(contacts);
			System.out.println("Searialized");
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	List<Contact> deserializeContact(String filename) {
		FileInputStream fis;
		ObjectInputStream oo;
		List<Contact> ls = new ArrayList<Contact>();
		try {

			fis = new FileInputStream(filename);
			oo = new ObjectInputStream(fis);

			ArrayList<Contact> earr1 = new ArrayList<Contact>();
			// Employee e2 = new Employee();
			earr1 = (ArrayList<Contact>) oo.readObject();
			for (Iterator iterator = earr1.iterator(); iterator.hasNext();) {
				Contact employee = (Contact) iterator.next();
				ls.add(employee);
				System.out.print("Deserialized:" + employee.contactID + " "
						+ employee.ContactName + " " + employee.emailA);
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
		return ls;

	}

	Set<Contact> populateContactFromDb() {DatabaseFunction df=new DatabaseFunction();
		Set<Contact> s = new TreeSet<Contact>();
		ResultSet rs;
		Contact c = new Contact();
	String str;String temp[] ;
		try {
			rs = DatabaseFunction.stmt
					.executeQuery("select * from contact_tbl;");
			while (rs.next()) {

				c.contactID = rs.getInt(1);
				c.ContactName = rs.getString(2);
				c.emailA = rs.getString(3);
				 str = rs.getString(4);
				 if(!str.equals(null))
					 {System.out.println(str);
				 temp=str.split(",");
				 for(int i=0;i<temp.length;i++)
				 c.contactNumber.add(temp[i]);
				 }
				s.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return s;
	}

	public static void main(String[] args) {
		List<Contact> obj = new ArrayList<Contact>();

		Contact c = null;
		File f = new File("contact");
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String str;
			String temp[];

			while ((str = br.readLine()) != null) {
				c = new Contact();
				temp = str.split(",");
				{
					c.contactID = Integer.parseInt(temp[0]);
					c.ContactName = temp[1];
					c.emailA = temp[2];
					for (int j = 3; j < temp.length; j++)
						c.contactNumber.add(temp[j]);

					c.addContact(c, obj);

					
				}
			}
			Scanner sc1 = new Scanner(System.in);
			Contact c1 = new Contact();
			System.out.println("enter the contact name to be searched");
			c1 = c.searchContactByName(sc1.next(), obj);
			System.out.print(c1.contactID + " " + c1.ContactName + " "
					+ c1.contactNumber + " " + c1.emailA);

			System.out.println("enter the contact number to be searched");
			List<Contact> temp1 = new ArrayList<Contact>();
			temp1 = c.SearchContactByNumber(sc1.next(), obj);
			for (Iterator iterator = temp1.iterator(); iterator.hasNext();) {
				Contact contact = (Contact) iterator.next();
				System.out.print(contact.contactID + " " + contact.ContactName
						+ " " + contact.emailA);
			}

			System.out.println("enter the contact Id and number to be added");
			int cid = sc1.nextInt();
			String cno = sc1.next();
			c.addContactNumber(cid, cno, obj);
			for (Iterator iterator = obj.iterator(); iterator.hasNext();) {
				Contact contact = (Contact) iterator.next();
				System.out.println(contact.ContactName + " "
						+ contact.contactNumber);
			}
			// System.out.println(c[0].contactID);
			c.serializeContactDetails(obj, "serilizeContacts.ser");
			obj = c.deserializeContact("serilizeContacts.ser");

			
			Set<Contact> se=new TreeSet<Contact>();c=new Contact();
			se=c.populateContactFromDb();
			for (Iterator iterator = se.iterator(); iterator.hasNext();) {
				Contact contact = (Contact) iterator.next();
				System.out.println(contact.contactID+" "+contact.ContactName+" "+contact.emailA+" "+contact.contactNumber);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ContactNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
