package com.psl.EA4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Student implements Serializable, Comparable<Student> {
	private int rollNo;
	private String name;
	private int standard;
	private char grade;

	public Student(int roll, String n, int std, char grd) {
		// TODO Auto-generated constructor stub
		rollNo = roll;
		name = n;
		standard = std;
		grade = grd;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Set<Student> readFile() {
		Set<Student> st = new TreeSet<Student>();

		FileInputStream fis;
		ObjectInputStream oo;

		try {

			fis = new FileInputStream("data.ser");
			oo = new ObjectInputStream(fis);

			ArrayList<Student> earr1 = new ArrayList<Student>();
			// Employee e2 = new Employee();
			earr1 = (ArrayList<Student>) oo.readObject();

			for (Iterator<Student> iterator = earr1.iterator(); iterator
					.hasNext();) {
				Student employee = (Student) iterator.next();

				st.add(employee);

			}

			for (Iterator<Student> iterator = st.iterator(); iterator.hasNext();) {
				Student student = (Student) iterator.next();
				System.out.println("name:" + student.name + " grade: "
						+ student.grade + " rollno: " + student.rollNo
						+ " standard: " + student.standard);
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

		return st;

	}

	public Map<Character, Set<Student>> sortStudentsAsPerGrade(
			Set<Student> students) {

		Map<Character, Set<Student>> ms = new TreeMap<Character, Set<Student>>();
		for (Iterator<Student> iterator = students.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			Set<Student> te=new TreeSet<Student>();
			for (Iterator iterator2 = students.iterator(); iterator2.hasNext();) {
				Student student2 = (Student) iterator2.next();
				if(student.grade==student2.grade){
					te.add(student2);
				}
				
			}
			
			ms.put(student.grade, te);

		}
		for (Map.Entry<Character, Set<Student>> entry : ms.entrySet()) {
			Set<Student> s = new TreeSet<Student>();
			s = entry.getValue();
			System.out.print("Key: " + entry.getKey() + ". Value: ");
			for (Iterator<Student> iterator = s.iterator(); iterator.hasNext();) {
				Student student = (Student) iterator.next();
				System.out.println("name:" + student.name + " grade: "
						+ student.grade + " rollno: " + student.rollNo
						+ " standard: " + student.standard);
			}
		}

		return null;

	}

	public static void main(String[] args) {
		List<Student> ls = new ArrayList<Student>();
		Set<Student> st = new TreeSet<Student>();
		Student set = new Student();
		Student s[] = new Student[3];
		s[0] = new Student(1, "Ramesh", 7, 'C');
		s[1] = new Student(3, "Suresh", 8, 'A');
		s[2] = new Student(2, "Nishit", 8, 'C');
		ls.add(s[0]);
		ls.add(s[1]);
		ls.add(s[2]);
		FileOutputStream fos;
		ObjectOutputStream oi;
		try {
			fos = new FileOutputStream("data.ser");
			oi = new ObjectOutputStream(fos);
			oi.writeObject(ls);
			oi.flush();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		st = set.readFile();
		for (Iterator<Student> iterator = st.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student.grade);
		}
		s[0].sortStudentsAsPerGrade(st);
	}

	@Override
	public int compareTo(Student o) {

		if (rollNo > o.rollNo)
			return 1;
		else if (rollNo < o.rollNo)
			return -1;
		else
			return 0;
	}
}
