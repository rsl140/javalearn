package com.homework.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串19
 * @时间 2017.5.30
 * */
public class zuoye19 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入第一段内容：");
		String str1 = input.next();
		System.out.println("输入第二段内容：");
		String str2 = input.next();
		String out = str1.equals(str2) ?"两个字符串相等":"两个字符串不相等";
		System.out.println(out);
	}
}
