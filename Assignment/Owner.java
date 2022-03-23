package com.overriding.java;

public class Owner {
		public static void main(String[] args) {
			Car c = new Car();
			c.drive();
			Audi a = new Audi();
			a.drive();
		}
}
