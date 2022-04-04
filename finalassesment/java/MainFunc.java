package com.finalassesment.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainFunc {
	public static void main(String[] args) {
		int x;
		int id;
		String name, course;
		float marks;
		ArrayList<Student> li = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the Option");
			System.out.println(
					"1.add_student\n 2.edit_student\n 3.delete_student\n 4.list_of_student\n 5.get_studentby_id\n 6.sort_student\n 7.exit\n");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				Student student = new Student();
				li.add(student);
				System.out.println("enter the details");
				System.out.println("1.id\2.name\3.mark\4.course");
				id = sc.nextInt();
				name = sc.next();
				marks = sc.nextFloat();
				course = sc.next();
				student.add_student(id, name, marks, course);
				break;
			case 2:
				System.out.println("enter the id to edit");
				while (true) {
					int ch = sc.nextInt();
					for (int i = 0; i < li.size(); i++) {
						if (li.get(i).getId() == ch) {
							System.out.println("enter the details");
							System.out.println("1.id\2.name\3.mark\4.course");
							id = sc.nextInt();
							name = sc.next();
							marks = sc.nextFloat();
							course = sc.next();
							li.get(i).setId(id);
							li.get(i).setName(name);
							li.get(i).setMarks(marks);
							li.get(i).setCourse(course);
							break;
						}
					}
					break;
				}
				break;
			case 3:
				System.out.println("enter the id to delete");
				int id1 = sc.nextInt();
				for (int i = 0; i < li.size(); i++) {
					if (li.get(i).getId() == id1) {
						li.remove(i);
						break;
					}
				}
				break;
			case 4:
				System.out.println(li);
				break;
			case 5:
				System.out.println("enter the id to get");
				int id2 = sc.nextInt();
				for (int i = 0; i < li.size(); i++) {
					if (li.get(i).getId() == id2) {
						System.out.println(li.get(i));
						break;
					}
				}
				break;
			case 6:
				System.out.println("enter the sorting type");
				System.out.println("1.SortById\n2.SortByName\n3.SortBymark\n4.SortByCourse");
				int sort = sc.nextInt();
				switch (sort) {
				case 1:
					Collections.sort(li, new SortById());
					break;
				case 2:
					Collections.sort(li, new SortByName());
					break;
				case 3:
					Collections.sort(li, new SortByMark());
					break;
				case 4:
					Collections.sort(li, new SortByCourse());
					break;
				default:
					break;
				}

				break;
			case 7:
				System.exit(1);
				break;
			default:
				break;
			}
		}

	}
}