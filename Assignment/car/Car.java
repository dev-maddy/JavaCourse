package com.onebill.car;

public class Car {
			int price;
			int number;
		Car(int p,int n)
		{
			price=p;
			number=n;
		}
		public void Accelerator()
		{
			System.out.println("Vechicle Moving");
		}
		public void Break()
		{
			System.out.println("Vechicle Stops");
		}
}
