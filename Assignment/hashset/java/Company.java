package com.hashset.java;
import java.util.*;

import com.collection.java.Collection;

public class Company {
		public static void main(String[] args) {
			Employee maddy=new Employee(1,"Maddy", "Trainee",25000);
			Employee harish=new Employee(2,"Harish", "Trainee",25000);
			Employee Niyaz=new Employee(3,"Niyaz", "Trainee",25000);
			Employee ranjith=new Employee(4,"Ranjith", "Trainee",25000);
			HashSet<Object> li = new HashSet<>();
			li.add(Niyaz);
			li.add(harish);
			li.add(maddy);
			li.add(Niyaz);
			li.add(ranjith);
			Iterator<Object> iterator2 = li.iterator();
			while(iterator2.hasNext())
			{
				System.out.println(iterator2.next());
			}
		}
}