package com.finalassesment.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Edit_Student {
	Scanner sc = new Scanner(System.in);

	public Edit_Student(ArrayList<Student> s) {
		System.out.println("Enter the Type for Edit");
		System.out.println("1.id\n 2.name\n 3.course\n 4.marks\t");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			int flag = 0;
			System.out.println("enter the id");
			int ch = sc.nextInt();
			for (int i = 0; i < s.size(); i++) {
				if (s.get(i).getId() == ch) {
					System.out.println("enter the details");
					System.out.println("1.id\2.name\3.mark\4.course");
					int id = sc.nextInt();
					for (int j = 0; j < s.size(); j++) {
						if (s.get(j).getId() == id) {
							System.out.println("Duplicate Id Founded");
							flag = 1;
							break;
						}
					}
					if (flag == 1)
						break;
					String name = sc.next();
					float marks = sc.nextFloat();
					String course = sc.next();
					s.get(i).setId(id);
					s.get(i).setName(name);
					s.get(i).setMarks(marks);
					s.get(i).setCourse(course);
					break;
				}
			}
			break;
		case 2:
			int flag1 = 0;
			System.out.println("enter the name");
			String ch1 = sc.next();
			for (int i = 0; i < s.size(); i++) {
				if (s.get(i).getName().equals(ch1)) {
					System.out.println("enter the details");
					System.out.println("1.id\2.name\3.mark\4.course");
					int id = sc.nextInt();
					for (int j = 0; j < s.size(); j++) {
						if (s.get(j).getId() == id) {
							System.out.println("Duplicate Id Founded");
							flag = 1;
							break;
						}
					}
					if (flag1 == 1)
						break;
					String name = sc.next();
					float marks = sc.nextFloat();
					String course = sc.next();
					s.get(i).setId(id);
					s.get(i).setName(name);
					s.get(i).setMarks(marks);
					s.get(i).setCourse(course);
					break;
				}
			}
			break;
		case 3:
			int flag3 = 0;
			System.out.println("enter the course");
			String ch3 = sc.next();
			for (int i = 0; i < s.size(); i++) {
				if (s.get(i).getCourse().equals(ch3)) {
					System.out.println("enter the details");
					System.out.println("1.id\2.name\3.mark\4.course");
					int id = sc.nextInt();
					for (int j = 0; j < s.size(); j++) {
						if (s.get(j).getId() == id) {
							System.out.println("Duplicate Id Founded");
							flag = 1;
							break;
						}
					}
					if (flag3 == 1)
						break;
					String name = sc.next();
					float marks = sc.nextFloat();
					String course = sc.next();
					s.get(i).setId(id);
					s.get(i).setName(name);
					s.get(i).setMarks(marks);
					s.get(i).setCourse(course);
					break;
				}
			}
			break;
		case 4:
			int flag4 = 0;
			System.out.println("enter the marks");
			int ch4 = sc.nextInt();
			for (int i = 0; i < s.size(); i++) {
				if (s.get(i).getMarks() == ch4) {
					System.out.println("enter the details");
					System.out.println("1.id\2.name\3.mark\4.course");
					int id = sc.nextInt();
					for (int j = 0; j < s.size(); j++) {
						if (s.get(j).getId() == id) {
							System.out.println("Duplicate Id Founded");
							flag = 1;
							break;
						}
					}
					if (flag4 == 1)
						break;
					String name = sc.next();
					float marks = sc.nextFloat();
					String course = sc.next();
					s.get(i).setId(id);
					s.get(i).setName(name);
					s.get(i).setMarks(marks);
					s.get(i).setCourse(course);
					break;

				}
			}
			break;
		default:
			System.out.println("enter valid choice");
			break;
		}
	}
}