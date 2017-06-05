package com.homework.Exception;

import java.util.Scanner;

public class ZY9 {
	public static void main(String[] args) {
		int [] a = {1,2,3,0,5,9};
		int [] b = {0,2,4,0,5,3};
		TestDivideByZeroZY1 test = new TestDivideByZeroZY1();
		int count=0;
		for(int i = 0;i<10;i++){
			int temp = (int)(Math.random()*5);
			try {
				
				test.div(a[temp],b[temp]);
				
			} catch (DivideByZeroExZY1 e) {
				count++;
			}
			
		}
		System.out.println("出现次数："+count);
	}
}
