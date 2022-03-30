package com.collection.java;

public class MyArrayList {
	private Object[] Array;
	private int size=10;
	int position;

	public MyArrayList() {
		Array = new Object[size];
	}

	public MyArrayList(int size) {
		this.size = size;
		Array = new Object[size];
	}

	public void add(Object obj) {
		if (position >=size) {
			increseCap();
		}
		Array[position] = obj;
		position++;
	}

	private void increseCap() {
		this.size = ((size * 3) / 2) + 1;
		Object[] temp = new Object[size];
		for (int i = 0; i < Array.length; i++) {
			temp[i] = Array[i];
		}
		Array = temp;
	}

	public void test() {
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
	}

}
