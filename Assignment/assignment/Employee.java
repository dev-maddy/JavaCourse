package com.onebill.assignment;

public class Employee extends Member{
	String Specialization;
	public Employee(String n,int ag,long ph_no,int add,int sal,String Spec)
	{
		super(n,ag,ph_no,add,sal);
		Specialization=Spec;
	}
	public void Spec()
	{
		System.out.println("--Specialization--"+Specialization);
	}
}
