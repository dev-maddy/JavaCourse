package com.Abstract.java;

public class Admin extends User {
	public Admin(String name,long number) {
		super(name,number);
	}
	public void Add() {
		System.out.println(name +" Added User1");
	}
	public void Remove(){
		System.out.println(name +" Removed User2");
	}
}
