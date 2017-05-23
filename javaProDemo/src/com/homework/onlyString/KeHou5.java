package com.homework.onlyString;

import java.util.Scanner;

/**
 * @功能 课后5
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 机房
 * */
public class KeHou5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一段字符串:");
		String ch = input.next();
		System.out.println("输入要查询的字符:");
		String findch = input.next();
		String[] str = ch.split("");
		System.out.print("字符串的下标为：:");
		for(int i = 0;i < str.length;i++){
			if(str[i].equals(findch)){
				System.out.print(i + " ");
			}
		}
	}

}
