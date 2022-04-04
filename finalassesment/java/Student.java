package com.finalassesment.java;

import java.util.*;

public class Student {
	private int id;
	private String name;
	private float marks;
	private String Course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public void add_student(int id, String name, float marks, String course) {
		setId(id);
		setName(name);
		setMarks(marks);
		setCourse(course);
	}

	public void edit_student() {

	}

	public void delete_student() {

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", Course=" + Course + "]";
	}

	public void get_studentby_id() {

	}

	public void sort_student() {

	}
}
