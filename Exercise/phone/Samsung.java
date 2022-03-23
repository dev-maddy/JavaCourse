package com.onebill.phone;

public class Samsung extends Smartphone{
		int Special;
		public Samsung(int price,int ram)
		{
			super(price,ram);
		}
		public void remind()
		{
			System.out.println("from samsung");
		}
}
