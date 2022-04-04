package com.finalassesment.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Add_Student {
	Scanner sc = new Scanner(System.in);

	public Add_Student(ArrayList<Student> s) {
		Student student = new Student();
		System.out.println("enter the details");
		System.out.println("1.id\2.name\3.mark\4.course");
		int id = sc.nextInt();
		for (int i = 0; i < s.size(); i++)
			if (s.get(i).getId() == id) {
				System.out.println("Enter non-Duplicate Value");
				return;
			}
		String name = sc.next();
		float marks = sc.nextFloat();
		String course = sc.next();
		student.add_student(id, name, marks, course);
		s.add(student);
	}
}
