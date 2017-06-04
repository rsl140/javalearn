package com.homework.zonghe;

import java.util.Arrays;

public class FingSumZuoYe6 {
	public void find(int[] num){
		Arrays.sort(num);
		int sum = 0;
		for(int i=0;i<num.length;i++){
			sum+=num[i];
		}
		System.out.println("最大值："+num[num.length-1]);
		System.out.println("最小值："+num[0]);
		System.out.println("平均值："+sum/num.length);
	}
	public static void main(String[] args) {
		FingSumZuoYe6 test = new FingSumZuoYe6();
		int [] num = {2,3,1,5,2,9};
		test.find(num);
	}
}
