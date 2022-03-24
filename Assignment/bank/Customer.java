package com.onebill.java.bank;

public class Customer {
	public static void main(String[] args) {
		Bank cus1=new BankA();
		cus1.setBalance(100);
		System.out.println(cus1.getBalance());
		Bank cus2=new BankB();
		cus2.setBalance(150);
		System.out.println(cus2.getBalance());
		Bank cus3=new BankC();
		cus3.setBalance(200);
		System.out.println(cus3.getBalance());
	}
}
