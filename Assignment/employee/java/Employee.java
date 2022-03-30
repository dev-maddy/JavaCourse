package com.employee.java;

public class Employee{
		int id;
		String name;
		String Designation;
		double salary;
		public Employee(int id,String n,String Des,int sal)
		{
			this.id=id;
			this.name=n;
			this.Designation=Des;
			this.salary=sal;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", Designation=" + Designation + ", salary=" + salary
					+ "]";
		}
		
}
 