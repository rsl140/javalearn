package com.homework.classString;
/**
 * @功能 类的有参 课后练习6
 * @作者 饶思羚
 * @时间 2017.5.21
 * @地址 机房
 * */
public class InsertArrayIn {
	//插入到数组
	public int[] insertArray(int [] array, int index, int value){
		int[] newArray = new int[array.length + 1];//增加数组长度
		//赋值
		for(int i = 0;i < array.length;i++){
			newArray[i] = array[i];
		}
		//移位
		for(int j = newArray.length-1;j > index-1;j--){
			newArray[j] = newArray[j-1];
		}
		newArray[index-1] = value;
		return newArray;
	}
	//显示数组
	public void getArray(int [] array){
		for(int i = 0;i < array.length;i++){
				System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
