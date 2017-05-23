package com.homework.classString;

import java.util.Scanner;
public class TextInsertArrayIn {
	/**
	 * @功能 类的有参 课后练习6
	 * @作者 饶思羚
	 * @时间 2017.5.21
	 * @地址 机房
	 * */
	
	public static void main(String[] args) {
		InsertArrayIn inser = new InsertArrayIn();
		
		int[] array = new int[]{0,1,2,3,4,5,6};
		
		Scanner input = new Scanner(System.in);
		//插入前显示
		inser.getArray(array);
		//输入不正确时循环输入
		boolean flag = false;
		int index;
		do{
			System.out.println("请输入插入位置：");
			index = input.nextInt();//插入位置
			if(index <= 0){
				System.out.println("请输入有效位置");
				flag = true;
			}
		}while(flag);
		
		
		System.out.println("请输入插入内容：");
		int value = input.nextInt();//插入位置
		
		//获取插入后数组
		int[] arrays = inser.insertArray(array, index, value);
		
		
		inser.getArray(arrays);
	}

}
