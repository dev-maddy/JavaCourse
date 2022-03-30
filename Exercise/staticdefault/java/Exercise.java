package com.staticdefault.java;

public class Exercise {
		public void chat() {
			System.out.println("From Chat");
		}
		public static void hello() {
			System.out.println("From Hello");
		}
		public static void main(String[] args) {
			TestFunctionInterface t=new Exercise()::chat;
			t.message();
			TestFunctionInterface t1=Exercise::hello;
			t1.message();
		}
		
}
