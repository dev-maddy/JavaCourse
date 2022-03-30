package com.thread.java;

public class MultiTasking extends Thread {
	int max;
	public MultiTasking(int x) {
		super();
		this.max = x;
	}

	@Override
	public void run() {
		try {
			while(max>0)
			{
				if(max%2==0)
					System.out.println(max);
				Thread.sleep(500);
				max--;
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		MultiTasking multi = new MultiTasking(10);
		multi.start();
		MultiTasking multi2 = new MultiTasking(20);
		multi2.start();
	}
}
