package com.psl.QuesCsv;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Book {
	int book_id;
	String book_name;
	String book_author;
	double book_price;
	BookCategory book_category;
	static ArrayList<Book> ls = new ArrayList<Book>();

	public Book(int b_id, String b_name, String book_auth, double b_p,
			BookCategory bc) {
		book_id = b_id;
		book_name = b_name;
		book_author = book_auth;
		book_price = b_p;
		book_category = bc;

		// TODO Auto-generated constructor stub
	}

	public void store(Book bk) {
		ls.add(bk);
	}

	public void print(ArrayList al) {
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			System.out.println(" Book_id:" + book.book_id + " ;Book Name:"
					+ book.book_name + " ;Book Author:" + book.book_author
					+ " ;Book price:" + book.book_price + " ;Book Category:"
					+ book.book_category);
			System.out.println();
		}
	}

	public void search(String b) {

		System.out.println("Printing books with Book Category " + b);
		for (Iterator iterator = ls.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if (book.book_category == BookCategory.valueOf(b)) {
				System.out.println(" Book_id:" + book.book_id + " ;Book Name:"
						+ book.book_name + " ;Book Author:" + book.book_author
						+ " ;Book price:" + book.book_price + " ;Book Category:"
						+ book.book_category);
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		File f = new File("bookdetails.csv");
		Book b[] = new Book[10];
		FileInputStream fis = null;
		String str;
		try {
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String split[] = new String[5];
			for (int i = 0, j = 0; (str = br.readLine()) != null; i++) {
				split = str.split(",");
				b[i] = new Book(Integer.parseInt(split[j]), split[j + 1],
						split[j + 2], Double.parseDouble(split[j + 3]),
						BookCategory.valueOf(split[j + 4]));

				b[i].store(b[i]);

				// System.out.println();
			}
			b[0].print(ls);
			System.out.println("\n\n\n");
			String t = "Computer";
			b[0].search(t);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
