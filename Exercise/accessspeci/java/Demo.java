package com.accessspeci.java;

import onebill.main;

public class Demo {
	public int x = 10;
	private int y = 20;
	protected int a = 30;
	int z = 40;

	public void hello() {
		System.out.println("Hello from Public");
	}

	protected void hello1() {
		System.out.println("Hello from Protected");
	}

	private void hello2() {
		System.out.println("Hello from private");
	}

	void hello3() {
		System.out.println("Hello from default");
	}

	public static void main(String[] args) {
		Demo demo2 = new Demo();
		System.out.println(demo2.a);
		System.out.println(demo2.x);
		System.out.println(demo2.y);
		System.out.println(demo2.z);
	}
}
