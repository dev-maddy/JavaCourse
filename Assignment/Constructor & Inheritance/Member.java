package com.onebill.assignment;

public class Member {
			String Name;
			int age;
			long Phone_Number;
			int Address;
			int Salary;
			public Member(String n,int ag,long ph_no,int add,int sal)
			{
				Name=n;
				age=ag;
				Phone_Number=ph_no;
				Address=add;
				Salary=sal;
			}
			public void details()
			{
				System.out.println("Name "+Name);
				System.out.println("Age "+age);
				System.out.println("Phone_Number "+Phone_Number);
				System.out.println("Address "+Address);
				System.out.println("Salary "+Salary);
			}
			public void printSalary()
			{
				System.out.println("Salary Of the Employee is  :"+ Salary);
			}

			
}
