package com.exercise.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.collection.java.Collection;

public class Management {
	public static void main(String[] args) {
		Student student1 = new Student(1,"Maddy","IT", 962914163);
		Student student2 = new Student(2, "Niyaz","IT",1234567890);
		Student student3 = new Student(3,"Harish","IT", 237354734);
		Student student4 = new Student(4,"Naveen","IT", 234234344);
		HashSet<Student> friend=new HashSet<>();
		friend.add(student2);
		friend.add(student4);
		friend.add(student3);
		friend.add(student1);
		friend.remove(student4);
		ArrayList arrayList = new ArrayList<>(friend);
		SortById sortById = new SortById();
		Collections.sort(arrayList,sortById);
		Iterator iterator1 = arrayList.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		System.out.println("=========");
		for (Object object : arrayList) {
			System.out.println(object);
		}
	}
}
