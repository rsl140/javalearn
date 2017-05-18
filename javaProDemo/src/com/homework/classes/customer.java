package com.homework.classes;

/**
 * @功能：面向对象1-上机练习二
 * @作者：饶思羚
 * @地点：机房
 * @时间：2017.5.17
 * */
public class customer {
	int number;//积分
	String type;//类型
	
	//显示顾客信息
	public void show(){
		System.out.println("积分：" + number + "，卡类型：" + type);
	}
}
