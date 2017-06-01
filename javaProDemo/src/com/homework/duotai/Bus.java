package com.homework.duotai;

public class Bus extends MotoVehicle{
	public Bus(String no, String brand) {
		super(no, brand);
	}

	public double calRent(int days){
		double num =0;
		switch(this.brand){
		case "金龙":
			num=1000*days;
			break;
		}
		return num;
	}
}
