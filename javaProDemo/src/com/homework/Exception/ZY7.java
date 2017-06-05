package com.homework.Exception;

import java.util.Scanner;

public class ZY7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try{
			int a = input.nextInt();
			int b = input.nextInt();
			try {
				System.out.println(a/b);
			} catch (Exception e) {
				System.out.println("除数不能为0");
			}
		}catch (Exception e) {
			System.out.println("输入非法数字！");
		}
	}
}
