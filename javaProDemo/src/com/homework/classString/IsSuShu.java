package com.homework.classString;

/**
 * @功能 课后练习5（素数）
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 机房
 * */
public class IsSuShu {
	public boolean isPrime(int value){
//		素数只能被1和本身整除
		
		boolean flag = true;
		int count = 0;//技术有多少个能被整除
		
		for(int i = 1;i <= value;i++){
			if(value % i == 0){
				count++;
			}
		}
		if(count>2){
			flag = false;
		}
		return flag;
	}
	
}
