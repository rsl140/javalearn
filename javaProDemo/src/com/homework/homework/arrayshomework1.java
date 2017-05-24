package com.homework.homework;
import java.util.Arrays;
/*
 * @功能：找出最低积分
 * @作者：饶思羚
 * @时间：2017.5.8
 * @地点：家
 */
public class arrayshomework1 {

	public static void main(String[] args) {
		int[] nums = new int[] {18,25,7,36,13,2,89,63};
		int temp = 0;//定义一个存储最小值的变量
		int index = 0;//定义一个存储下标的变量
		int[] temparray = nums.clone();//克隆原数组并保存在一个变量中
		Arrays.sort(temparray);//对变量进行升序排序
		for(int i = 0;i<nums.length;i++){
			if(nums[i]==temparray[0]){//循环原数组与排序后的数组中第一个数对比得出原数组最小值
				temp = nums[i];
				index = i;
			}
		}
		System.out.println("最低积分是："+temp);
		System.out.println("下标为："+index);
	}

}
