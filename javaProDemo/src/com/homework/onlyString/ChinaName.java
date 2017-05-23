package com.homework.onlyString;

import java.util.Scanner;

/**
 * @功能 课后4
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 家
 * 
 * */
public class ChinaName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入姓名:");
		String name = input.next();
		String x = name.substring(0,1);
		String m = name.substring(1);
		System.out.println("姓："+ x +"，名："+ m );
	}

}
