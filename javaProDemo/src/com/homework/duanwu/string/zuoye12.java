package com.homework.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串12
 * @时间 2017.5.30
 * */
public class zuoye12 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个字符串：");
		String str = input.next();
		String[] str1 = str.split("");
		int count = 0;
		for(int i = 0;i<str1.length;i++){
			if(str1[i].equals("e")){
				count++;
			}
		}
		System.out.println("e出现的次数为：" + count);
	}
}
