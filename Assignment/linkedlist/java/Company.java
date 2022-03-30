package com.linkedlist.java;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.collection.java.Collection;

public class Company {
		public static void main(String[] args) {
			Employee maddy=new Employee(1,"Maddy", "Trainee",25000);
			Employee harish=new Employee(2,"Harish", "Trainee",25000);
			Employee Niyaz=new Employee(3,"Niyaz", "Trainee",25000);
			Employee ranjith=new Employee(4,"Ranjith", "Trainee",25000);
			LinkedList<Employee> li= new LinkedList<>();
			li.add(Niyaz);
			li.add(harish);
			li.addFirst(maddy);
			li.add(3,Niyaz);
			li.addLast(harish);
			Iterator<Employee> iterator2 = li.iterator();
			while(iterator2.hasNext())
			{
				System.out.println(iterator2.next());
			}
		}
}