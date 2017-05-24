package com.homework.Object1;

import com.demo.chapter10.StaticTest;

/**
 * @功能：上机练习4
 * @作者：饶思羚
 * @地点：机房
 * @时间：2017.5.24
 * */
public class Penguin {
	static String SEX_MALE = "Q仔";
	static String SEX_FEMALE = "Q妹";
	String name;
	String age;
	public static void main(String[] args) {
		//静态方法只能调用静态方法或者属性
		
		Penguin a = new Penguin("123","90");
		Penguin b = new Penguin("456","9");
		Penguin c = new Penguin("789","7");
		System.out.println(a.SEX_FEMALE);
		Penguin.SEX_MALE="雄";
		Penguin.SEX_FEMALE="雌";
		System.out.println(a.SEX_FEMALE);
		
	}
	
	public Penguin(String name,String age){
		this.name=name;
		this.age=age;
	}
}
