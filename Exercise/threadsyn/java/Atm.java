package com.threadsyn.java;

public class Atm {
	public static void main(String[] args) {
		Account account = new Account(100000);
		Parent parent=new Parent(account);
		Child child=new Child(account);
		
		parent.start();
		child.start();
		try {
			Thread.sleep(500);
			account.getBalance();
		}catch(InterruptedException e) {
	}
}
}
