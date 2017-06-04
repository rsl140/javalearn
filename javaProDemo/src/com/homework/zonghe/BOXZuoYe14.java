package com.homework.zonghe;

import java.util.Scanner;

public class BOXZuoYe14 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入长：");
		int chang = input.nextInt();
		System.out.println("输入宽：");
		int kuan = input.nextInt();
		System.out.println("输入高：");
		int gao = input.nextInt();
		System.out.println("体积："+chang*kuan*gao);
	}
	
}
