package com.staticdefault.java;

public interface Interface1 {
	default void message() {
		System.out.println("Hiiii");
	}
}
