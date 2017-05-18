package com.homework.classNoString;

import java.util.Scanner;

/**
 * @功能 类的无参 课后作业1
 * @作者 饶思羚
 * @时间 2017.5.18
 * @地址 机房
 * */
public class Season {
	//判断季节
	public void isFourSeason(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入月份：");
		int num = input.nextInt();
		if(num >= 1 && num <= 3){
			System.out.println("该季节是春季");
		}
		else if(num >= 4 && num <= 6){
			System.out.println("该季节是夏季");
		}
		else if(num >= 7 && num <= 9){
			System.out.println("该季节是秋季");
		}
		else if(num >= 10 && num <= 12){
			System.out.println("该季节是冬季");
		}else{
			System.out.println("输入错误！");
		}
	}
	//调用季节
	public static void main(String[] arry){
		Season s = new Season();
		s.isFourSeason();
	}
}
