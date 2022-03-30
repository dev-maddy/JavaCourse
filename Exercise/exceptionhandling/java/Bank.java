package com.exceptionhandling.java;

public class Bank {
	int balance;
	private int withdrawal;

	public int getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(int withdrawal) {
		this.withdrawal = withdrawal;
	}

	public void check(int balance,int withdrawal)
		{
			if(balance>0 && balance>withdrawal)
			{
				balance=balance-withdrawal;
				System.out.println("Transaction Successful");
			}
			else
			{
				try{
						throw new Insufficient("Insufficient Balance");
				}catch(Insufficient e)
				{
					e.printStackTrace();
				}
			}
		}
}
