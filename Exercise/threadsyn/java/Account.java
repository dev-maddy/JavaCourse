package com.threadsyn.java;

public class Account {
	int balance;
	public Account(int a)
	{
		this.balance=a;
	}
	public void Deposit(int amount) {
		balance = balance + amount;
	}

	public synchronized void  Withdraw(int amount) {
		if (balance > amount) {
			balance = balance - amount;
		}
	}

	public void getBalance() {
		System.out.println("The Balance Left is =" + balance);
	}
}
