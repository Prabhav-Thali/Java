package com.psl.ea74;

public class CalculatorSimulator {
	public CalculatorSimulator() {

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
       TaxCalculator tc=new TaxCalculator("Nishit",true,15000);
       System.out.println("Tax amount is: "+tc.calculateTax());
	}
}
