package com.homework.classString;

import java.util.Arrays;


/**
 * @功能 课后练习4
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 机房
 * */
public class FindTall {
	/*随机生成随机身高*/
	public double height(){
		double[] heights = new double[10];
		for(int i = 0;i < heights.length;i++){
			heights[i] = (double)(80 + Math.random() * 120);//随机生成80到200得身高
			System.out.println(heights[i]);
		}
		Arrays.sort(heights);
		
		System.out.println("-------------");
		return heights[heights.length-1];
	}
}
