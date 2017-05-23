package com.homework.onlyString;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @功能 课后3
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 家
 * 
 * */
public class SortFriut {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入五种水果以英文逗号隔开:");
		String friut = input.next();
		String[] arry = friut.split(",");
		Arrays.sort(arry);
		for(String str:arry){
			System.out.print(str + " ");
		}
	}
}
