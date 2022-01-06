package com.te.threadusingBankingExample;

public class Main {
	public static void main(String[] args) throws Exception {
		Account account = new Account(1000);
		Boyfriend boyfriend = new Boyfriend(account);
		Girlfriend girlfriend = new Girlfriend(account);
		boyfriend.start();
		girlfriend.start();
		boyfriend.join();
		girlfriend.join();
		System.out.println("wait completed");
		account.checkBalance();

	}
}
