package com.exceptionhandling.java;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class User {
		public static void main(String[] args) {
			Bank bank = new Bank();
			System.out.println("Enter the Balance in the bank");
			Scanner sc=new Scanner(System.in);
			bank.balance=sc.nextInt();
			System.out.println("Enter the Withdrawal Amount");
			bank.setWithdrawal(sc.nextInt());
			
			bank.check(bank.balance,bank.getWithdrawal());
		}
}
