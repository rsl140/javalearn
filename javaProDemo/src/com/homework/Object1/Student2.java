package com.homework.Object1;

public class Student2 {
	String name;
	int age;
	String sex;
	String zy;
	
	public Student2(String name,int age){
		this.sex = "男";
		this.zy = "计算机";
		this.name = name;
		this.age = age;
	}
	public Student2(String name,int age,String sex,String zy){
		this.sex = sex;
		this.zy = zy;
		this.name = name;
		this.age = age;
	}
	public void show(){
		System.out.println("姓名："+ name +",年龄："+ age +",性别："+ sex +",专业："+ zy);
	}

}
