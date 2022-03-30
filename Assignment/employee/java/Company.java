package com.employee.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.collection.java.Collection;

public class Company {
		public static void main(String[] args) {
			Employee maddy=new Employee(1,"Maddy", "Trainee",25000);
			Employee harish=new Employee(2,"Harish", "Trainee",25000);
			Employee Niyaz=new Employee(3,"Niyaz", "Trainee",25000);
			Employee ranjith=new Employee(4,"Ranjith", "Trainee",25000);
			ArrayList<Employee> listofemployee=new ArrayList<>();
			listofemployee.add(maddy);
			listofemployee.add(ranjith);
			listofemployee.add(Niyaz);
			listofemployee.add(harish);
			//for(int i=0;i<listofemployee.size();i++)
				//System.out.println(listofemployee.get(i));
		//	System.out.println("==============");
			//for (Employee employee : listofemployee) {
				//System.out.println(employee);
			//}
			//System.out.println("==============");
			//Collections.sort(listofemployee);
			System.out.println("Enter the Method to Sort the Employee");
			System.out.println("1.SortByName  2.SortById 3.SortBySalary 4.SortByDesignation");
			Scanner sc=new Scanner(System.in);
			int key=sc.nextInt();
			switch (key) {
			case 1:SortByName sortbyname=new SortByName();
				Collections.sort(listofemployee,sortbyname);
				break;
			case 2:SortById sortbyid= new SortById();
				Collections.sort(listofemployee,sortbyid);
				break;
			case 3:SortBySalary sortbysal=new SortBySalary();
				Collections.sort(listofemployee,sortbysal);
				break;
			case 4:SortByDesign sortDes=new SortByDesign();
				break;
			default:
				break;
			}
			Iterator<Employee> iterator = listofemployee.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
			
			}
		}
