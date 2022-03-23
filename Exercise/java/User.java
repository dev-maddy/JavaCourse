package com.Abstract.java;

public class User {
	String name;
	long number;
	public User()
	{
		
	}
	public User(String nam, long num) {
		name = nam;
		number = num;
	}
	public void chat()
	{
		System.out.println(name +" is chatting");
	}
	public void share()
	{
		System.out.println(name +" is Sharing Something");
	}
	public void call()
	{
		System.out.println(name +" is Calling  "+number);
	}
}
