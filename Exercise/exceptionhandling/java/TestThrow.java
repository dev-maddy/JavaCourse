package com.exceptionhandling.java;

public class TestThrow {
	public static void main(String[] args) {
		System.out.println("Program Started");
		try
		{
			throw new ArithmeticException();
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
		System.out.println("Program Ends");
	}
}
