package com.demo.chapter10;

import java.util.Scanner;

public class TryCatch1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入课程代号（1~3）之间的数字");
		
		
		try {
			int num = input.nextInt();
			switch(num){
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("C++");
				break;
			case 3:
				System.out.println("C#");
				break;
				default:
					System.out.println("请输入1-3之间的数字");
			}
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println("你输入的有问题哦！");
		}finally {
			System.out.println("欢迎提出建议：");
		}
	}
}
