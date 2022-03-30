package com.functioninter.java;

public class Solving {
		public int mul(int a,int b)
		{
			return a*b;
		}
		public static int div(int a,int b)
		{
			return a/b;
		}
		public static void main(String[] args) {
			MainInterFace main=new Solving()::mul;
			System.out.println(main.add(20, 30));
			MainInterFace main1=Solving::div;
			System.out.println(main1.add(100, 50));
		}
}
