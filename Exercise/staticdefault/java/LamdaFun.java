package com.staticdefault.java;

public class LamdaFun {
	public static void main(String[] args) {
		Runnable run = () -> {
			System.out.println("From Lamda");
			System.out.println("");
		};
		Thread thread = new Thread(run);
		thread.start();
	}
}
