package com.homework.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串20
 * @时间 2017.5.30
 * */
public class zuoye20 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入：");
		String str1 = input.next();
		System.out.println(str1);
		char a = str1.charAt(0);
		
		if(a >= 'A' && a <= 'Z'){
			int count = 0;
			for(int i = 0;i<str1.length();i++){
				if(str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z'){
					count++;
				}
			}
			System.out.println("大写有：" + count);
		}else{
			System.out.println("第一个字母不是大写字母!");
		}
	}
}
