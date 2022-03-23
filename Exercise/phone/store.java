package com.onebill.phone;

public class store {
	public static void main(String[] args) {
		Smartphone p=new Smartphone(18000,4,3,22);
		//System.out.println(p.price);
		//System.out.println(p.ram);
		p.call();
		Smartphone s=new Smartphone(100000,5,33,2);
		s.camera();
		s.game();
		Samsung Sam=new Samsung(20000,4);
		Sam.remind();
		Iphone app=new Iphone(20000,30);
		app.siri();

	}
}
