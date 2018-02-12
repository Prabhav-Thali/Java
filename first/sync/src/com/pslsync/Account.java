package com.pslsync;

public class Account extends Thread implements Runnable {
	private int balance;
	public Account(int balance) {
	this.setBalance(balance);
	
		// TODO Auto-generated constructor stub
	}
	
	
	
@Override
public void run() {
	// TODO Auto-generated method stub

}
	public static void main(String[] args) {
	
}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}

}
