package com.abc.tax;

public class TaxCalculator {
	float basicSalary, netSalary, tax;
	boolean citizenship;

	public TaxCalculator(float bs, boolean c) {
		// TODO Auto-generated constructor stub
		basicSalary = bs;
		citizenship = c;
	}

	public void calculateTax() {
		// TODO Auto-generated method stub
		tax = 30 * basicSalary / 100;
		System.out.println("The Tax is " + tax + " for " + basicSalary);
	}

	public void deductTax() {
		netSalary = basicSalary - tax;
		System.out.println("The nettSalary is " + netSalary + ".");

	}

	public void validateSalary() {
		// TODO Auto-generated method stub
		if (basicSalary > 100000 && citizenship)
			System.out
					.println("The salary and citizenship eligibility criteria is satisfied.");
		else
			System.out
					.println("The salary and citizenship eligibility criteria is not satisfied.");
	}

	public static void main(String[] args) {
		float basic = Float.parseFloat(args[0]);
		boolean citizen = Boolean.parseBoolean(args[1]);
		TaxCalculator tc = new TaxCalculator(basic, citizen);
		tc.calculateTax();
		tc.deductTax();
		tc.validateSalary();
	}
}
