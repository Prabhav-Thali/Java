package com.tac.Services;

public class Service {
	String[] serviceName = { "Talktime", "SMS", "2G", "3G", "4G" };
	float[] charges = { 30, 30, 99, 199, 299 };
	int userServices[] = new int[5];
	int totalCharges;
	float tax = 0;

	

	public Service(char[] s1) {
		for (int i = 0; i < 5; i++)
			userServices[i] = s1[i];
		// TODO Auto-generated constructor stub
	}

	public Service() {
		// TODO Auto-generated constructor stub
	}

	public void Services() {
		totalCharges = 0;
		System.out.println("Availed Services By user are:");
		;
		totalCharges = 0;
		for (int i = 0; i < 5; i++) {
			if (userServices[i] == 1) {
				totalCharges += charges[i];
				System.out.println(serviceName[i]);
			}
		}
		tax = totalCharges * 15 / 100;
		System.out.println("Total Charges are:Rs." + (totalCharges + tax)
				+ " with Service tax of: Rs." + tax);
		System.out.println("\n");
	}

}// TODO Auto-generated constructor stub

