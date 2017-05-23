package com.homework.classString;

import java.util.Scanner;

public class TestIsSuShu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = input.nextInt();
		IsSuShu test = new IsSuShu();
		boolean s = test.isPrime(num);
		if(s){
			System.out.println(num + "是素数！");
		}else{
			System.out.println(num + "不是素数！");
		}

	}

}
