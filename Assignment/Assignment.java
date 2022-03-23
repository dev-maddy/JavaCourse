package com.assignment.java;

import java.util.*;

public class Assignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = sc.nextInt();
		System.out.println("upto " + number + " even numbers are:");
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		System.out.println("upto " + number + " odd numbers are:");
		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}

	}
}
