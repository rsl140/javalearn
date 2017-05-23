package com.homework.classString;

import java.util.Scanner;
/**
 * @功能 类的有参 课后练习2
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 机房
 * */
public class JavaTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JavaTest test = new JavaTest();
		System.out.println("请输入第一个数字：");
		int num1 = input.nextInt();
		System.out.println("请输入第二个数字：");
		int num2 = input.nextInt();
		System.out.println("两个数字的平均值为：" + test.avg(num1,num2));

	}
	public int avg(int big,int small){
		int money = 0;
		money = (big + small) / 2;
		return money;
	}

}
