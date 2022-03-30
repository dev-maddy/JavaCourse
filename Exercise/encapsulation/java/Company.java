package com.encapsulation.java;

public class Company {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("maddy");
		emp1.setAge(21);
		emp1.setDesignation("Developer");
		emp1.setSalary(28500);
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getDesignation());
		System.out.println(emp1.getSalary());
		}
}
