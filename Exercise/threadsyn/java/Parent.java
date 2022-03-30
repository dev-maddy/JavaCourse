package com.threadsyn.java;

public class Parent extends Thread {
	Account account;

	public Parent(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.Withdraw(100);
		}
	}

}
