package com.demo.chapter1_9;

public class Visitor {
	/*
	 * @功能：课堂演示
	 * @作者：饶思羚
	 * @时间：2017.5.17
	 * @地点：
	 */
	
	String name;//游客年龄
	int age;//游客年龄
	
	/**
	 * 显示姓名以及门票价格
	 * */
	public void showTicketInfo(){
		System.out.println("游客姓名：" + name);
		String priceInfo = "";//价格信息
		
		if(age < 12){
			priceInfo = "免费";
		}
		else if(age >= 12 && age < 60){
			priceInfo = "半价";
		}
		else{
			priceInfo = "全价";
		}
		System.out.println(priceInfo);
		
	}
}
