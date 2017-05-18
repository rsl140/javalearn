package com.homework.classNoString;
/**
 * @功能 类的无参 课后作业2
 * @作者 饶思羚
 * @时间 2017.5.18
 * @地址 机房
 * */
public class ATM {
	int amount;//定义余额
	//显示余额
	public void showAmount(){
		System.out.println("账户余额为：" + amount);
	}
	
	public static void main(String[] arry){
		ATM atm = new ATM();
		atm.amount = 1200;
		atm.showAmount();
	}
}
