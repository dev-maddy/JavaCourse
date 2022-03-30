package com.hasarel.java;

public class Amaon {
	public static void main(String[] args) {
		Battery battery = new Battery();
		battery.Brand = "Toshiba";
		battery.price = 12000;
		Ram ram = new Ram();
		ram.name = "SSD";
		ram.size = 16;
		Brand brand = new Brand();
		brand.Name = "Mac-Book";
		brand.price = 150000;
		Monitor monitor = new Monitor();
		monitor.Brand = "Samsung";
		monitor.Res = 1800;
		Laptop laptop = new Laptop();
		laptop.battery = battery;
		laptop.brand = brand;
		laptop.monitor = monitor;
		laptop.ram = ram;
		System.out.println(laptop);
	}
}
