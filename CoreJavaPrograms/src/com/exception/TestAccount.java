package com.exception;

public class TestAccount {
	public static void main(String[] args) throws WithdrawException {
		Account a = new Account();
		a.setBalance(5000);

		//a.withdraw(3000);
		a.deposit(1000);
		
		System.out.println(a.getBalance());
		
	}

}
