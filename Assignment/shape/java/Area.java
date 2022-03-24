package com.shape.java;

public class Area extends Shape{

	@Override
	public void RectangleArea(int l, int b) {
		System.out.println(l*b);
		
	}

	@Override
	public void SquareArea(int s) {
		System.out.println(s*s);
		
	}

	@Override
	public void CircleArea(int r) {
		System.out.println(3.14*r*r);
	}
		
}
