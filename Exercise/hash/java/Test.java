package com.hash.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<>();
		hashset.add(10);
		hashset.add(20);
		System.out.println(hashset);
		Iterator<Integer> iterator = hashset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=====");
		LinkedHashSet<Integer> linkedset = new LinkedHashSet<>();
		linkedset.add(10);
		linkedset.add(20);
		linkedset.add(30);
		linkedset.add(40);
		Iterator<Integer> iterator2 = linkedset.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("============");
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(40);
		tree.add(20);
		tree.add(50);
		tree.add(15);
		Iterator<Integer> iterator3 = tree.iterator();
		while (iterator3.hasNext()) {
				System.out.println(iterator3.next());
		}
	}
}
