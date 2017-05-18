package com.homework.classes;
/**
 * @作者：饶思羚
 * @功能：面向对象一-课后作业4
 * @地址：机房
 * @时间：2017.5.17
 * */
public class ClassRoom {
	String className;//班级归属
	String type;//教室类型
	int classSize;//教室大小（容纳多少人）
	
	//显示教室信息
	public void show(){
		System.out.println("当前班级：" + className + "，教室类型：" + type + "，容纳人数：" + classSize);
	}
}
