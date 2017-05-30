package com.homework.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串8
 * @时间 2017.5.30
 * */
public class zuoye8 {
	public static void main(String[] args) {
		String str = "FEDCBA";
		String[] str1 = str.split("");
		
		for(int i = 0;i < str1.length;i++){
			System.out.println(str1[i]);
		}
	}
	
}
