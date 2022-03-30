package com.exceptionhandling.java;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		try {
			int res = num1 / num2;
			int[] a;
			a = new int[res];
			System.out.println(a[4] = 20);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Is Out of Index");
		} catch (ArithmeticException e) {
			System.out.println("From the Arthemetic");
		}
		System.out.println("Program End");
	}
}
