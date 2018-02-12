package com.psl.assigmentd2;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] m = new Medicine[10];
		int randomNum = 1 + (int) (Math.random() * 3);
		switch (randomNum) {
		case 1:
			m[1] = new Tablet("SunPharma", "Verna", "Crocin", 100);
			m[1].displayLabel();
			break;
		case 2:
			m[2] = new Syrup("Glenmark", "Goa", "Benadryl",
					"Store in cool and dry place");
			m[2].displayLabel();
			break;
		case 3:
			m[3] = new Oinment("Cipla", "Verna", "iodex", "External use only");
			m[3].displayLabel();
			break;
		default:
			System.out.println("");
		}
	}
}
