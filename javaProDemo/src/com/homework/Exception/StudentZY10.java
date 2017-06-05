package com.homework.Exception;

import java.util.Scanner;

public class StudentZY10 {
	public void speak(int m) throws MyExceptionZY10{
		if(m<1000){
			throw new MyExceptionZY10("要大于1000");
		}
	}
	
	public static void main(String[] args) {
		StudentZY10 test = new StudentZY10();
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个数：");
		try{
			int a = input.nextInt();
			test.speak(a);
		}catch (MyExceptionZY10 e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
