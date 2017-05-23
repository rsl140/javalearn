package com.homework.classString;
/**
 * @功能 课后练习1
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 机房
 * */

import java.util.Scanner;

public class Daikuan {
	Scanner input = new Scanner(System.in);
	//总利息 = 贷款金额 * 利息 | 每月还款金额 = （贷款金额 + 总利息） / 贷款年限
	/*显示主页面*/
	public void Mnue(){
		System.out.println("请输入贷款金额：");
		double amount = input.nextDouble();
		System.out.println("请选择贷款年限：1、3年(36个月)，2、5年(60个月)，3、20年(240个月)");
		int select = input.nextInt();
		double allAmount;//总利息
		double mounthOfMoney;//每月还款
		double lx = 0;//利息
		int mounth = 1;//月份
		switch(select){
		case 1:
			//6.03%
			lx = 6.03;
			mounth = 36;
			break;
		case 2:
			//6.12%
			lx = 6.12;
			mounth = 60;
			break;
		case 3:
			//6.39%
			lx = 6.39;
			mounth = 240;
			break;
			default:
		}
		allAmount = this.amount(amount,lx);
		mounthOfMoney = this.amountOfMonth(amount,allAmount,mounth);
		System.out.println("每月还款：" + mounthOfMoney);
	}
	/*返回总利息*/
	public double amount(double amount,double lx){
		double amounts;//存储总利息并返回
		amounts =amount*(lx / 100);
		return amounts;
	}
	/*返回每月还款金额*/
	public double amountOfMonth(double amount,double allAmount,int mounth){
		double mounthOfMoney;//存储每月还款金额
		mounthOfMoney = (amount + allAmount) / mounth;
		return mounthOfMoney;
	}
	
}
