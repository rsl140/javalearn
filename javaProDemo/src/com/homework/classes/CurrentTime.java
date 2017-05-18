package com.homework.classes;
/**
 * @作者：饶思羚
 * @功能：面向对象一-课后作业2
 * @地址：机房
 * @时间：2017.5.17
 * */
public class CurrentTime {
	int year;//年
	int mouth;//月
	int day;//日
	int h;//时
	int m;//分
	int s;//秒
	
	//显示时间
	public void show(){
		System.out.println("时间为：");
		System.out.println(year + "年" + mouth + "月" + day + "日" + s + "时" + m + "分" + s + "秒");
	}
	
	
}
