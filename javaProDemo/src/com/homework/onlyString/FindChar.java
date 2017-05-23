package com.homework.onlyString;

import java.util.Scanner;

/**
 * @功能 上机练习3
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 机房
 * */
public class FindChar {
	public static int counter(String inputs, String word){
		int counter = 0;	//计数器，初值为0
		String[] chars = inputs.split("");
		for(int i = 0;i < chars.length;i++){
			if(chars[i].equals(word)){
				counter++;
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		FindChar findch = new FindChar();
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个字符串：");
		String inputs = input.next();
		System.out.println("输入要查找的字符：");
		String word = input.next();
		int count = findch.counter(inputs, word);
		System.out.println("其中包含：" + count +"个" + word);
	}
}
