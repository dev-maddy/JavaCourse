package com.exceptionhandling.java;

public class UnderAgeException extends RuntimeException {
	UnderAgeException(String msg) {
		super(msg);
	}
}
