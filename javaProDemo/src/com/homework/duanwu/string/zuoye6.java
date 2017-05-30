package com.homework.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串6
 * @时间 2017.5.30
 * */
public class zuoye6 {
	public static void main(String[] args) {
		String str1="你";
		String str2="我";
		if(str1.compareTo(str2)>0){
			System.out.println("汉字“你”大");
		}if(str1.compareTo(str2)==0){
			System.out.println("两个汉字一样大");
		}else{
			System.out.println("汉字“我”大");
		}
	}
	
}
