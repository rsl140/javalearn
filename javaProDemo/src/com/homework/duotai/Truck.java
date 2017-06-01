package com.homework.duotai;

public class Truck extends MotoVehicle{

	public Truck(String no, String brand) {
		super(no, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calRent(int days) {
		double num =0;
		switch(this.brand){
		case "解放":
			num=50*days;
			break;
		
		}
		return num;
	}

}
