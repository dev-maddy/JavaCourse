package com.threadmul.java;

import java.util.ArrayList;

public class MyThread extends ArrayList<Integer> implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

}
