package com.assignment.java;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of A");
		int a = sc.nextInt();
		System.out.println("Enter the value of B");
		int b = sc.nextInt();
		System.out.println("Enter the Number of times to be print:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = 0; j < n; j++) {
				if (j == 0)
					sum = sum + (a + (int) Math.pow(2, j) * b);
				else
					sum = sum + ((int) Math.pow(2, j) * b);
				System.out.println(sum);
			}
			System.out.println();
		}
	}
}
