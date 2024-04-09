package com.exception;

public class Account {
	public static double balance = 0;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public static double withdraw(double b) throws WithdrawException {
		balance = balance - b;
		if (balance < 2000) {
			throw new WithdrawException("insufficient balance");
		}
		return balance;
	}

	static double deposit(double bal) {
		balance = balance + bal;
		return balance;
	}

}
