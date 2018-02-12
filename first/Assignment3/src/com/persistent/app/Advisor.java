package com.persistent.app;

public class Advisor {
	String[] message = new String[5];

	public Advisor() {
		// TODO Auto-generated constructor stub
		message[0] = "keep helping";
		message[1] = "Eat healthy";
		message[2] = "Be Fit";
		message[3] = "keep calm";
		message[4] = "Just be yourself";
	}

	public String getAdvice() {
		int i = (int) (Math.random() * 5);
		return message[i];

	}
}
