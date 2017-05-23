package com.homework.classString;
/**
 * @功能 类的有参 上机练习3
 * @作者 饶思羚
 * @时间 2017.5.21
 * @地址 机房
 * */
public class Print {
	public void printTriangle(int row, String ch){
		for(int i = 0;i < row;i++){
			for(int j = 0;j <= i;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
