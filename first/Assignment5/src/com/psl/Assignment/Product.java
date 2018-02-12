package com.psl.Assignment;

import java.util.Hashtable;
import java.util.Map;

public class Product {
	String productName;
	int productNum;

	public Product(String name, int val) {
		productName = name;
		productNum = val;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " " + productName + " p" + productNum;
	}

	public static void main(String[] args) {

		Product p[] = new Product[10];
		p[0] = new Product("Maruti800", 1);
		p[1] = new Product("Marutizen", 2);
		p[2] = new Product("MarutiwagonR", 3);
		p[3] = new Product("MarutiAlto", 4);
		p[4] = new Product("Marutik10", 5);
		p[5] = new Product("MarutiS-cross", 6);
		p[6] = new Product("MarutiKizashi", 7);
		p[7] = new Product("MarutiSwift", 8);
		p[8] = new Product("MarutiSwiftDzire", 9);
		p[9] = new Product("MarutiCiaz", 10);

		Map<Integer, Product> m = new Hashtable<Integer, Product>();

		for (int i = 0; i < p.length; i++)
			m.put(i, p[i]);

		String str = "MarutiCiaz";
		for (int i = 0; i < 10; i++) {
			if (str.equals(p[i].productName)) {
				System.out.println("Product removed:" + p[i].productName + " "
						+ p[i].productNum);
				m.remove(i);

				break;
			}
		}
		for (int i = 0; i < p.length; i++) {
			if (m.get(i) != null) {
				System.out.println(m.get(i));
			}
		}

	}

}
