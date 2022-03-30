package com.employee.java;

import java.util.Comparator;

public class SortByDesign implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.Designation.compareTo(o2.Designation);
	}

}
