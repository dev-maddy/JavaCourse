package com.onebill.car;

public class Bmw extends Car{
		int model;
		int speed;
		public Bmw(int price,int number,int mod,int sp) 
		{
			super(price,number);
			model=mod;
			speed=sp;
			System.out.println("=====From Bmw=====");
			System.out.println("price :"+price+"   number :"+number+"   model :"+model+"  Speed:"+speed);
		}
		public Bmw(int price,int number)
		{
			super(price,number);
		}
		public void model(String model)
		{
				System.out.println("The Model Is "+model);
		}
}
