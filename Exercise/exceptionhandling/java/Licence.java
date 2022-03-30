package com.exceptionhandling.java;

public class Licence {
	private int age;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void Apply(String n, int age) {
		if (age > 18) {
			System.out.println("Eligible");
		} else {
			try {
				throw new UnderAgeException("Your Age is Not Sufficient");
			} catch (UnderAgeException e) {
				e.printStackTrace();
			}
		}
	}
}