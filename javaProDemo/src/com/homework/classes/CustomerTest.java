package com.homework.classes;
/**
 * @作者：饶思羚
 * @功能：对象一-上机练习5
 * @地址：机房
 * @时间：2017.5.17
 * */

public class CustomerTest {

	public static void main(String[] args) {
		customer cusromer1 = new customer();//创建实例
		//赋值
		cusromer1.number = 3050;
		cusromer1.type = "金卡";
		cusromer1.show();
		//判断是否回馈积分
		if(cusromer1.type.equals("金卡") && cusromer1.number > 1000){
			System.out.println("回馈积分500分！");
		}
		else if(cusromer1.type.equals("普卡") && cusromer1.number > 5000){
			System.out.println("回馈积分500分！");
		}
		else{
			System.out.println("无回馈积！");
		}

	}

}
