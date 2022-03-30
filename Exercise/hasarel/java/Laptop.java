package com.hasarel.java;

public class Laptop {
	Battery battery;
	Ram ram;
	Brand brand;
	Monitor monitor;

	@Override
	public String toString() {
		return "Laptop [battery=" + battery + ", ram=" + ram + ", brand=" + brand + ", monitor=" + monitor + "]";
	}
}
