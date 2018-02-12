package com.psl.exception;

public class UserDefExceptionDemo {
	private void validateAge(int age) throws InvalidAgeException {
		// TODO Auto-generated method stub

		if (age < 18) {
			throw new InvalidAgeException("InvalidAge");

		} else
			System.out.println(age);

	}

	public static void main(String[] args) {
		int age = 19;
		UserDefExceptionDemo u = new UserDefExceptionDemo();
		System.out.println("BA");
		assert age > 18 : "invalidAge";
		System.out.println("AA");

		try {
			u.validateAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

	}
}
