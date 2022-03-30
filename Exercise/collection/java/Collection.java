package com.collection.java;

import java.util.*;

public class Collection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		List li=new ArrayList();
		li.add(40);
		li.add(50);
		li.add(60);
		list.addAll(li);
		System.out.println(list);
		list.removeAll(li);
		System.out.println(list);
	}
}
