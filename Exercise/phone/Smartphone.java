package com.onebill.phone;

public class Smartphone extends phone {
	int camera;
	int cameracount;

	public Smartphone(int price, int ram, int c, int cc) {// in this line the
		super(price, ram);// super class send the value of price and ram to super class(phone);
		camera = c;// then the cam and camcount assighned here because this is smart spec;
		cameracount = cc;
		System.out.println("From the Smartphone");
	}

	public Smartphone(int price, int ram) {
		super(price, ram);
	}

	public void game() {
		System.out.println("game from Apple");
	}

	public void camera() {
		System.out.println("camera from Apple");
	}
}
