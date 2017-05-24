package com.demo.chapter10;
/**
 * static使用
 * */
public class StaticTest {
	static String SEX_MALE = "Q仔";
	static String SEX_FEMALE = "Q妹";
	String name;
	String age;
	public static void main(String[] args) {
		//test();//静态方法只能调用静态方法或者属性
		
		StaticTest a = new StaticTest("123","90");
		StaticTest b = new StaticTest("456","9");
		StaticTest c = new StaticTest("789","7");
		System.out.println(a.SEX_FEMALE);
		StaticTest.SEX_FEMALE="2";
		b.SEX_FEMALE = "1";
		System.out.println(a.SEX_FEMALE);
		
	}
	
	public StaticTest(String name,String age){
		this.name=name;
		this.age=age;
	}

}
