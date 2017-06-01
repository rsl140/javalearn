package com.homework.duotai;

public class Customer {
	public double calcToteRent(MotoVehicle[] motos, int day){
		double num = 0;
		for (int i = 0; i < motos.length; i++) {
			num+=motos[i].calRent(day);
		}
		return num;
	}
}
