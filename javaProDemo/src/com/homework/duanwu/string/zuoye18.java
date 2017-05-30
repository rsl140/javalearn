package com.homework.duanwu.string;

import java.util.Random;
import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串18
 * @时间 2017.5.30
 * */
public class zuoye18 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个数：");
		int num = input.nextInt();
		zuoye18 zy = new zuoye18();
		zy.show(num);
	}
	//生成随机数
	public int[] randoms(int a){
		Random rand = new Random();
		int[] num = new int[a];
		for(int i = 0;i < a;i++){
			//(50+50) is the maximum and the 50 is our minimum 
			num[i] = rand.nextInt(50) + 50;
		}
		return num;
	}
	//打印
	public void show(int num){
		
		int [] nums = randoms(num);
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}
}
