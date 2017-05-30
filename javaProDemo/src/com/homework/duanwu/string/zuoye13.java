package com.homework.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串13
 * @时间 2017.5.30
 * */
public class zuoye13 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个字符串：");
		String str = input.next();
		String[] str1 = str.split("s");
		String str2 = "";
		for(int i = 0;i<str1.length;i++){
			str2+=str1[i];
		}
		System.out.println(str2);
	}
}
