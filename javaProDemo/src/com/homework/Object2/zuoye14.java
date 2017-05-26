package com.homework.Object2;

public class zuoye14 {
	int a;
	int b;
	
	public int jia(){
		return a + b;
	}
	public int jian(){
		return a - b;
	}
	public int cheng(){
		return a * b;
	}
	
	public String toString(){
		return "加："+jia()+",减："+jian()+",乘："+cheng();
	}
	
	public static void main(String[] args) {
		zuoye14 text = new zuoye14();
		text.a=19;
		text.b=3;
		System.out.println(text.toString());
	}
}
