package com.homework.Object2;

public class TestPhone {

	public static void main(String[] args) {
		Phone[] test = new Phone[5];
		test[0] = new Phone(111111);
		test[1] = new Phone(222222);
		test[2] = new Mobilephone(33333,"iphone");
		test[3] = new Fixedphone(44444,"座机在客厅");
		test[4] = new Cordlessphone(55555,"在卧室","子母机");
		
		System.out.println(test[0].getPhoneNumber());
		System.out.println(test[1].getPhoneNumber());
		System.out.println(test[2].getPhoneNumber());
		System.out.println(test[3].getPhoneNumber());
		System.out.println(test[4].getPhoneNumber());
	}

}
