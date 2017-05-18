package com.homework.classNoString;
/**
 * @功能 类的无参 上机练习1
 * @作者 饶思羚
 * @时间 2017.5.18
 * @地址 机房
 * */
public class ScoreCalc {
	int java;
	int db;
	int cSharp;
	
	/**
	 * 计算总成绩
	 * */
	public int calcTotleScore(){
		int totle = java + db + cSharp;
		return totle;
	}
	
	/**
	 * 显示总成绩
	 * */
	public void showTotleScore(){
		System.out.println("总成绩是：" + calcTotleScore());
	}
	
	/**
	 * 计算平均成绩
	 * */
	public int calcAvg(){
		int avg = calcTotleScore() / 3;
		return avg;
	}
	
	public void showAvg(){
		System.out.println("平均成绩是：" + calcAvg());
	}
}
