package com.finalassesment.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete_Student {
	Scanner sc = new Scanner(System.in);

	public Delete_Student(ArrayList<Student> s) {
		System.out.println("enter the id to delete");
		int id1 = sc.nextInt();
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).getId() == id1) {
				s.remove(i);
			}
		}
	}
}