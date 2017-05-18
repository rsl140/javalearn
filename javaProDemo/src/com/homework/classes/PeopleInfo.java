package com.homework.classes;
/**
 * @作者：饶思羚
 * @功能：面向对象一-课后作业5
 * @地址：机房
 * @时间：2017.5.17
 * */
public class PeopleInfo {
	String peoNo;//账号
	float lastMoney;//余额
	
	//存款
	public float putIn(float money){
		lastMoney += money;
		return lastMoney;
	}
	//取款
	public float putOut(float money){
		lastMoney -= money;
		return lastMoney;
	}
	//打印账户余额
	public void show(){
		System.out.println(lastMoney);
	}
	
}
