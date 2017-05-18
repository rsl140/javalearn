package com.homework.classes;
/**
 * @作者：饶思羚
 * @功能：面向对象一-课后作业4
 * @地址：机房
 * @时间：2017.5.17
 * */
public class Department {
	String DepartmentName;//学院
	int number;//人数
	
	//显示教室信息
	public void show(){
		System.out.println("学院：" + DepartmentName + "，人数：" + number );
	}
}
