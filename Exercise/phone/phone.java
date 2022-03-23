package com.onebill.phone;

public class phone {
	int price;
	int ram;

	public phone(int p, int r) {//then the price and ram assigned to this constructor
		price = p;//then go t0 2;
		ram = r;
	}

	public void call() {
		System.out.println("Calling from Nokia");
	}

	public void radio() {
		System.out.println("Radio From Nokia");
	}

	public void message(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {

	}
}
