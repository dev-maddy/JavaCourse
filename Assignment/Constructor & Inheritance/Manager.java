package com.onebill.assignment;
	
public class Manager extends Member{
		String Department;
		public Manager(String n,int ag,long ph_no,int add,int sal,String dep)
		{
			super(n,ag,ph_no,add,sal);
			Department=dep;
		}
		public void dep()
		{
			System.out.println("--Department--"+Department);
		}
}
