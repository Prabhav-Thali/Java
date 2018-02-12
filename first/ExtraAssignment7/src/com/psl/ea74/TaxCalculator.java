package com.psl.ea74;

public class TaxCalculator {
	String empName;
	boolean isIndian;
	double taxAmount, empSal;

	public TaxCalculator(String name, boolean c, double Sal) {

		empName = name;
		isIndian = c;
		empSal = Sal;
		// TODO Auto-generated constructor stub
	}

	public double calculateTax() {
		try {
			if (!isIndian)

				throw new CountryNotValidException();

			if (empName == null)
				throw new EmployeeNameInvalidException();

			if (empSal > 100000)
				taxAmount = empSal * 8 / 100;
			else if (empSal > 50000 && empSal < 100000)
				taxAmount = empSal * 6 / 100;
			else if (empSal > 30000 && empSal < 50000)
				taxAmount = empSal * 5 / 100;
			else if (empSal > 10000 && empSal < 30000)
				taxAmount = empSal * 4 / 100;
			else
				throw new taxNotEligibleException();

		} catch (EmployeeNameInvalidException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CountryNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (taxNotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return taxAmount;

	}
}
