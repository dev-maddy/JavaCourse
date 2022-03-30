package com.encapsulation.java;

public class Employee {
	private String name;
	private int age;
	private String Designation;
	private long salary;

	public String getName() {
		return name;
	}

	public String setName(String na) {
		return this.name = na;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		if (a > 0) {
			this.age = a;
		}
	}

	public String setDesignation(String des)
	{
		return this.Designation=des;
	}
		public String getDesignation() {
			return Designation;
		}
	public long setSalary(int sal){
		return this.salary=sal;
	}
	public long getSalary() {
		return salary;
	}

}
