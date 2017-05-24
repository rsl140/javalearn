package com.homework.Object1;
/**
 * @功能：课后练习 简答题2
 * @作者：饶思羚
 * @地点：机房
 * @时间：2017.5.24
 * */
public class Student1 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 16){
			System.out.println("年龄不能小于16岁");
			this.age = 16;
		}else{
			this.age = age;
			System.out.println("年龄更换成功！");
		}
	}
	//构造函数
	public Student1(String name,int age){
		this.setAge(age);
		this.setName(name);
	}
	//打印
	public void showMyself(){
		System.out.println("姓名：" + name + ",年龄：" + age);
	}
}
