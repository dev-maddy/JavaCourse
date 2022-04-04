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
				new Add_Student(li);
				break;
			case 2:
				new Edit_Student(li);
				break;
			case 3:
				new Delete_Student(li);
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