package com.homework.zonghe;

public class peopleZuoYe5 {
	private String name;
	private String sex;
	private int age;
	private int high;
	public peopleZuoYe5(){}
	//构造函数初始化
	public peopleZuoYe5(String name, String sex, int age, int high) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.high = high;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	
	
}
