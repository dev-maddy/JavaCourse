package com.onebill.assignment;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Maddy",21,9629141633l,309,25000,"Developer");
		employee.details();
		employee.Spec();
		employee.printSalary();
		Manager manager = new Manager("Mathavan", 35,8012427451l,415,40000,"Resourse");
		manager.details();
		manager.dep();
		manager.printSalary();
	}
}
