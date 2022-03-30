package com.exceptionhandling.java;

import java.util.Scanner;

public class Apply {
	public static void main(String[] args) {
		System.out.println("Enter the Age");
		Scanner sc = new Scanner(System.in);
		Licence licence2 = new Licence();
		licence2.setAge(sc.nextInt());
		System.out.println("Enter the Name");
		licence2.name = sc.next();
		licence2.Apply(licence2.name, licence2.getAge());

	}
}
