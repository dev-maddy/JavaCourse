package com.overriding.java;

public class Child extends Parent{
		
		public Child(int a, int b) {
		super(a, b);
	}
		public Child()
		{
			
		}

		public void add(int x,int y)
		{
			System.out.println(x+y+2000);
		}
}
