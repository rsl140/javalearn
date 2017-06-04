package com.homework.zonghe;

import java.util.Calendar;

public class BirthdayZuoYe28 {
	int Year;
	int mouth;
	int day;
	
	public BirthdayZuoYe28(){}
	public BirthdayZuoYe28(int year, int mouth, int day) {
		super();
		Year = year;
		this.mouth = mouth;
		this.day = day;
	}
	public void showAge(){
		int nowYear = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("年龄："+(nowYear-this.Year));
	}
	
	public static void main(String[] args) {
		BirthdayZuoYe28 test = new BirthdayZuoYe28(1991,5,8);
		test.showAge();
	}
}
