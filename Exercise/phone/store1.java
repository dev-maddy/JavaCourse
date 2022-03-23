package com.onebill.phone;

public class store1 {
		public static void main(String[] args) {
			Smartphone smart = new Smartphone(10000,4,33,2);//in this line the price and ram goes to phone contructor
			System.out.println(smart.price);//then the cam and camcount goes to smartphone constructor --1--
			System.out.println(smart.ram);// 3 prints the whole value
			System.out.println(smart.camera);
			System.out.println(smart.cameracount);
			Smartphone se=new Smartphone(12000, 8);
			System.out.println(se.price);
			System.out.println(se.ram);
		}
}
