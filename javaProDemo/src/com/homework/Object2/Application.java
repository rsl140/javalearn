package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础20
 * @时间 2017.5.26
 * */
public class Application {
	public double mySqr(int a){
		return Math.sqrt(a);
	}
	public double mySqr(float a){
		return Math.sqrt(a);
	}
	public double mySqr(double a){
		return Math.sqrt(a);
	}
	
	public static void main(String[] args) {
		Application test = new Application();
		System.out.println(test.mySqr(10));
		System.out.println(test.mySqr(10.2f));
		System.out.println(test.mySqr(10.10));
	}
}
