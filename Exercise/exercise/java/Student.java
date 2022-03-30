package com.exercise.java;
import java.util.ArrayList;
public class Student extends Management{
		int id;
		String name;
		String Department;
		long phone;
		public Student(int i,String n,String Dep,long p) {
			this.id=i;
			this.name=n;
			this.Department=Dep;
			this.phone=p;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", Department=" + Department + ", phone=" + phone + "]";
		}
		public int hashcode()
		{
			return id;
		}
		@Override
		public boolean equals(Object obj) {
			Student std=(Student)obj;
			return this.id==std.id;
		}
		@Override
		
		
		
}
