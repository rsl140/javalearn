package com.homework.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZY6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("输入一个除数");
			int a = input.nextInt();
			System.out.println("输入一个被除数");
			int b = input.nextInt();
			System.out.println(a/b);
			
		}catch (InputMismatchException|ArithmeticException e) {
			if(e instanceof InputMismatchException){
				System.out.println("非法输入，只能输入数字");
			}else if(e instanceof ArithmeticException){
				System.out.println("除数不能为0");
			}
		}
	}
}
