package com.overriding.java;

public class Parent {
	int x,y;
	public Parent(int a,int b)
	{
		x=a;
		y=b;
	}
	public Parent()
	{
		
	}
		public void add(int x,int y)
		{
			System.out.println(x+y);
		}
}
