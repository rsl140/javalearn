package com.homework.zonghe;

import java.util.Scanner;

public class ZuoYe15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入第1个数：");
		int num1 = input.nextInt();
		System.out.println("输入第2个数：");
		int num2 = input.nextInt();
		System.out.println("输入第3个数：");
		int num3 = input.nextInt();
		
		int num4 = num1>num2?num1:num2;
		int maxnum = num4>num3?num4:num3;
		System.out.println("最大值为："+maxnum);
	}
}
