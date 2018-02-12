package com.psl.Assignment7;

import java.util.Scanner;

public class Contact {
	String firstName, middleName, lastName, DateOfBirth, Email;
	long mn, tn;
	int val;

	public int checkEmpty() {
		// TODO Auto-generated method stub

		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Firstname ");
			firstName = s.nextLine();

			System.out.println("Enter middlename ");
			middleName = s.nextLine();

			System.out.println("Enter lastname ");
			lastName = s.nextLine();
			if ((firstName.equals("")) || (lastName.equals("")))
					 {
				val++;
				throw new EmptyMandatoryFields();
			
			} else {
				System.out.println("Enter Date of birth ");
				DateOfBirth = s.nextLine();

				System.out.println("Enter Email :example:-example@hotmail.com");
				Email = s.nextLine();
				if (!(Email.equals(""))|| !(DateOfBirth.equals(""))) {
					int athe = Email.indexOf('@');
					int dot = Email.indexOf('.');
					if (athe >= 0) {
						if (athe > dot) {
							val++;
							throw new InvalidEmail();
						}
					} else {
						val++;
						throw new InvalidEmail();
					}
				}
				else
					throw new EmptyMandatoryFields();

				System.out.println("enter mobile no");
				mn = s.nextLong();

				System.out.println("enter telephone no");
				tn = s.nextLong();
				s.close();

				System.out.println(tn);

				if ((tn > 0) || mn > 0)
					System.out.println("good to go");
				else {
					val++;
					throw new telemonum();
				}

			}
		} catch (EmptyMandatoryFields e) {
			System.out.println("Fill in the mandatory fields");
		} catch (InvalidEmail i) {
			System.out.println("enter valid email id");
		} catch (telemonum t) {
			System.out.println("enter valid Mobile number");

		}
		return val;

	}

}
