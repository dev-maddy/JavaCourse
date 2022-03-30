package com.array.java;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b[];
		System.out.println("Enter the Number of Values in Array");
		int n = sc.nextInt();
		b = new int[n];
		System.out.println("Enter the Values In array");
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}
}
