package com.staticdefault.java;

public interface Interface {
	default void message() {
		System.out.println("Hello");
	}
}
