package com.homework.homework;

public class stu {
	/*
	 * @功能：课堂作业
	 * @作者：饶思羚
	 * @时间：2017.5.17
	 * @地点：
	 */
	String stuName;
	int stuAge;
	int stuClass;
	String stuHobby;
	
	/**
	 * 输出学生信息
	 * */
	public void showStuInfo(){
		System.out.println("姓名：" + stuName);
		System.out.println("年龄：" + stuAge);
		System.out.println("班级：" + stuClass + "班");
		System.out.println("爱好：" + stuHobby);
	}
}
