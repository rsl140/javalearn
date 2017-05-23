package com.homework.onlyString;

import java.util.Scanner;

public class VipBirth {
	/**
	 * @功能 课后6
	 * @作者 饶思羚
	 * @时间 2017.5.23
	 * @地址 机房
	 * */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag;
		do{
			flag = true;
			System.out.println("输入生日:");
			String  bir= input.next();
			System.out.println("输入密码:");
			String pwd = input.next();
			String[] birs = bir.split("/");
			if(!(birs[0].length() == 2 && birs[1].length() == 2)){
				System.out.println("生日格式为:月/日");
			}else if(!(pwd.length() >= 6 && pwd.length() <= 10)){
				System.out.println("密码位数必须在6到10位之间");
			}
			else{
				System.out.println("成功！");
				flag = false;
			}
		}while(flag);
		
	}

}
