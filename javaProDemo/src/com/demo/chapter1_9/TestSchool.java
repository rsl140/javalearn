package com.demo.chapter1_9;

public class TestSchool {

	/*
	 * @功能：调用类
	 * @作者：饶思羚
	 * @时间：2017.5.17
	 * @地点：机房
	 */
	public static void main(String[] args) {
		demo6 jjCenter = new demo6();
		System.out.println("复制之前");
		jjCenter.showInfo();
		System.out.println("=====================");
		//使用对象成员变量
		jjCenter.schoolName = "北大青鸟锦江中心";
		jjCenter.classNumber = 33;
		jjCenter.labNumber = 33;
		
		System.out.println("打印中心的简介");
		//使用成员方法
		jjCenter.showInfo();

	}

}
