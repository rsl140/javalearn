package com.homework.duotai;

public class Car extends MotoVehicle{
	public Car(String no, String brand) {
		super(no, brand);
	}

	public double calRent(int days){
		double num =0;
		switch(this.brand){
		case "宝马":
			num=500*days;
			break;
		case "别克":
			num=600*days;
			break;
		
		}
		return num;
	}
}
