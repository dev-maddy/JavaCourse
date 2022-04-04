package com.finalassesment.java;

import java.util.Comparator;

public class SortByMark implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return (int) ((int) o2.getMarks() - o1.getMarks());
	}

}
