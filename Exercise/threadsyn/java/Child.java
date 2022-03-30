package com.threadsyn.java;

public class Child extends Thread {
	Account account;

	public Child(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.Withdraw(100);
		}
	}

}
