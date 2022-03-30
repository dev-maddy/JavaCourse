package com.threadmul.java;

public class Test {
		public static void main(String[] args) {
			MyThread myth = new MyThread();
			Thread thread = new Thread(myth);
			thread.start();
		}
}
