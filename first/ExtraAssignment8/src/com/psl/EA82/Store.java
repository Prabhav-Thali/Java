package com.psl.EA82;

import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;

public class Store {

	int itemId;
	String itemName;
	Grocery itemType;
	int itemQuantity;
	float itemPrice;

	public static void addGrocery(int itemId, String itemType, String itemName,
			int itemQuantity, float itemPrice) {

		try {

			System.out.println((Grocery.valueOf(itemType)).toString());
			DatabaseFunction.stmt.execute("insert into grocery values("
					+ itemId + ",'" + Grocery.valueOf(itemType) + "','"
					+ itemName + "'," + itemQuantity + "," + itemPrice + ");");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
