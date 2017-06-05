package com.homework.Exception;

import java.util.Scanner;

public class ZY8 {
	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = null;
		Scanner input = new Scanner(System.in);
		System.out.println("1.负数，2.空指针，3.超出长度");
		try{
			System.out.println("请选择");
			int num = input.nextInt();
			int temp = -3;
			switch(num){
			case 1 :
				if(temp<0){
					throw new NegativeArraySizeException();
				}
				break;
			case 2 :
				System.out.println(b[0]);
				break;
			case 3 :
				
				System.out.println(a[5]);
				break;
			}
		}catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
