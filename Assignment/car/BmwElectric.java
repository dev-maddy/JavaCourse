package com.onebill.car;

public class BmwElectric extends Bmw{
	int milege;
	int ChargingTime;
	public BmwElectric(int price, int number,int model,int speed,int mil,int Charg) {
		super(price, number,model,speed);
		milege=mil;
		ChargingTime=Charg;
		System.out.println("====From BmwElectric===");
		System.out.println("price :"+price+" number:"+number+"  Model:"+model +" Speed:"+speed+" milege:"+milege +" ChargingTime:"+ChargingTime);
	}	
}
