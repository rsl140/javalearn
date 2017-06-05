package com.homework.Exception;

import java.util.Scanner;

public class ZY5 extends Exception{

	public ZY5(String message) {
		super(message);
	}
	
	public static void test(int a) throws ZY5{
		if(a == 1 || a == 2 || a == 3){
			
		}else{
			throw new ZY5("非法输入，请输入1~3的数字");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("请输入1~3的数字");
		Scanner input = new Scanner(System.in);
		try{
			int a = input.nextInt();
			test(a);
		}catch (ZY5 e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	
}
