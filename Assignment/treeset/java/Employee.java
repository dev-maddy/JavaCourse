package com.treeset.java;
public class Employee implements Comparable<Employee>{
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
	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee) obj;
		return this.name.equals(e.name);
	}
	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
}