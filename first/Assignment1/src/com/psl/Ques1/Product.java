package com.psl.Ques1;

public class Product {

	static String[] initProductNames() {
		String productNames[] = new String[2];
		productNames[0] = "Samsung";
		productNames[1] = "Nokia";
		return productNames;

	}

	static boolean isPresent(String[] productNames, String keyword) {

		for (String name : productNames) {
			if (name == keyword)
				return true;
		}
		return false;
	}

	public static void main(String[] arg) {
		String keyword = "Samsung";
		String[] temp = initProductNames();
		if (isPresent(temp, keyword) == true)
			System.out.println("Product is Present");
		else
			System.out.println("Product is not present");

	}
}
