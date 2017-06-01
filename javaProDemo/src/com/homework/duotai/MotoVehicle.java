package com.homework.duotai;

public abstract class MotoVehicle {
	String no;//车牌
	String brand;//品牌
	int days;//租借天数
	public MotoVehicle(String no,String brand) {
		this.no = no;
		this.brand = brand;
	}
	
	public abstract double calRent(int days);
}
