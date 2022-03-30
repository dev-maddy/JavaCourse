package com.staticdefault.java;

public class Test {
	public static void main(String[] args) {
		MyFunctionalInter mi = (x, y) -> {
			return x + y;
		};
		double add = mi.add(20, 30);
		System.out.println(add);
	}
}
