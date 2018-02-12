package com.psl.EA73;

public class BankAccount {

	float balance;
	float amount;
	String type;

	public BankAccount(float Ibalance, String type) {
		// TODO Auto-generated constructor stub

		if (type == "Saving" && Ibalance < 500) {

			try {
				throw new lowBalanceException();
			} catch (lowBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (type == "Current" && Ibalance < 1000) {
			try {
				throw new lowBalanceException();
			} catch (lowBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.balance = Ibalance;

		this.type = type;

	}

	public void deposit(float amt) {

		if (amt < 0) {
			try {
				throw new InvalidAmountException();
			} catch (InvalidAmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		balance += amt;
		System.out.println("Amount Deposited is: " + amt);
	}

	public void withdraw(float amt) {
		if (type.equals("Saving")) {
			if (balance > 1000) {
				balance -= amt;
				System.out.println("S" + balance);
			} else {
				try {
					throw new InsufficientFundException();
				} catch (InsufficientFundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else if (type == "Current") {
			if (balance > 5000) {
				balance -= amt;
				System.out.println("C" + balance);
			} else {
				try {
					throw new InsufficientFundException();
				} catch (InsufficientFundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else
			System.out.println("enter valid Account type");

	}

	public float getBalance() {
		return balance;

	}

	public static void main(String[] args) {
		BankAccount ba[] = new BankAccount[5];
		ba[0] = new BankAccount(35000, "Saving");
		// ba[1] = new BankAccount(50000, "Saving");
		// ba[2] = new BankAccount(10000, "Current");
		// ba[3] = new BankAccount(35000, "Saving");
		// ba[4] = new BankAccount(15000, "Current");
 
		ba[0].deposit(50);
		ba[0].withdraw(400);
		System.out.println("balance: " + ba[0].getBalance());
	}

}
