package com.demo.chapter1_9;

public class demo6 {
	
	/*
	 * @功能：类的学习
	 * @作者：饶思羚
	 * @时间：2017.5.17
	 * @地点：机房
	 */
	/*
	 * 学校类
	 * 
	 * */
	String schoolName;//中心名称
	int classNumber;//教室数目
	int labNumber;//机房数量
	
	/**
	 * 显示机房的信息
	 * */
	public void showInfo(){
		System.out.println("中心名称：" + schoolName);
		System.out.println("教室数目：" + classNumber);
		System.out.println("机房数量：" + labNumber);
	}
}
