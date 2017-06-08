package com.demo.chapter10;
/**
 * 构造函数
 * */
public class Dog {
	public String name;
	int age;
	int love;//与主人亲密度
	String type;//品种
	
	/**
	 * 无参构造方法
	 * 1、没有返回值
	 * 2、方法名字与类名相同
	 * 3.当没有显式声明有参的构造方法的时候，java会默认生成一无参的构造方法，
	 * 一旦声明了有参的构造函数后，java就不会生成无参的构造函数
	 * 4.构造函数相互调用时，必须留一个出口否则回成为死循环
	 * */
	//重载
	public Dog(){
	}
	
	public Dog(String name){
//		this();
		this.name = name;
		//System.out.println("调用一个构造函数方法");
	}
//	
	public Dog(String name,int age){
		this(name);//调用一个String类型的参数构造函数方法
		this.age = age;
		//System.out.println("调用一个构造函数方法");
	}
	/**
	 * 打印狗的信息
	 * */
	
}
