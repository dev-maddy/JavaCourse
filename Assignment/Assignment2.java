package com.assignment.java;

import java.util.Scanner;

public class Assignment2 {
	int v=10;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = sc.nextInt();
		System.out.println("The Table of " + number);
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + number + " = " + i * number);
		}
	}
}
