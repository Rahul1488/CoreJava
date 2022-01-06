package com.te.threadusingBankingExample;

public class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("insufficient funds");
		} else {
			balance -= amount;
		}
	}
                                                   
	synchronized  public void deposit(int amount) {
		balance += amount;
	}

	public void checkBalance() {
		System.out.println(balance);
	}
}
