package com.homework.Object1;
/**
 * @功能：上机练习2
 * @作者：饶思羚
 * @地点：机房
 * @时间：2017.5.24
 * */
public class Dogs {
	String name;
	int age;
	int love;//与主人亲密度
	String type;//品种
	
	public Dogs(){
		//name = "小白";
		age = 1;
	}
	
	public Dogs(String name,String type){
		this();
		this.name = name;
		this.type = type;
		//System.out.println("调用一个构造函数方法");
	}
	public void print(){
		System.out.println(name + "是一只" + type + "犬。");
	}
}
