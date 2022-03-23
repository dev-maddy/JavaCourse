package com.onebill.car;

public class CarStore {
		public static void main(String[] args) {
			BmwElectric new1=new BmwElectric(20000,8055,02,180,23,14);
			new1.model("Eco-Audi");
			new1.Accelerator();
			new1.Break();
			Bmw new2 = new Bmw(50000,1234);
			System.out.println("===========");
			Bmw new3 = new Bmw(1500000,1234,54345,180);
		}
}
