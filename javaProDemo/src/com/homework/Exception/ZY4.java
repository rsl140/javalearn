package com.homework.Exception;

public class ZY4 {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("这是一个异常处理的案列：");
			System.out.println(4/0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
