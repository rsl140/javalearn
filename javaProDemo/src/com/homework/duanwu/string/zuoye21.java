package com.homework.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串21
 * @时间 2017.5.30
 * */
public class zuoye21 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入：");
		String str1 = input.next();
		
		System.out.println("字符个数为：" + str1.length());
		StringBuffer str2 = new StringBuffer(str1);
		System.out.println("反序输出为：" + str2.reverse().toString());
	}
}
