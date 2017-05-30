package com.homework.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串14
 * @时间 2017.5.30
 * */
public class zuoye14 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入:");
		String str=input.next();
		char[] str1=str.toCharArray();
		String str2 = "";
		for(int i=0;i<str1.length;i++){
			if(str1[i]>='0'&&str1[i]<='9'){
				str2+=str1[i];
			}
		}
		System.out.println(str2);
	}
}
