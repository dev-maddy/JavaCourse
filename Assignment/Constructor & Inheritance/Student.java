package com.onebill.assignment;

public class Student {
		String name;
		public Student()
		{
			name="Unknown";
		}
		public Student(String n)
		{
			name=n;
		}
		public void  PrintName()
		{
			System.out.println("Student Name is: "+name);
		}
}
