package com.homework.Object2;
/**
 * @author rsl
 * @功能 面向对象基础作业1
 * @时间 2017.5.25
 * */
import java.util.Scanner;

public class Student extends Score {
	
	private String name;
	/*初始化学生信息*/
	public Student(String name,String course, String grade) {
		super(course, grade);
		this.name = name;
	}
	public void getResult(){
		System.out.println("学生姓名：" + name + "，科目：" + super.getCourse() + ",分数:" + super.getGrade());
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		String name = input.next();
		System.out.println("请输入学生科目：");
		String course = input.next();
		System.out.println("请输入学生分数：");
		String grade = input.next();
		Student stu = new Student(name, course, grade);
		stu.getResult();
	}
}
