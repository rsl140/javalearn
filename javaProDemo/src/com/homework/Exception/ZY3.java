package com.homework.Exception;

import java.util.Scanner;

public class ZY3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("请输入一个除数");
			int a = input.nextInt();
			System.out.println("请输入一个被除数");
			int b = input.nextInt();
			System.out.println(a/b);
		}catch(Exception e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
}
