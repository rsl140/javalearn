package com.homework.classString;

import java.util.Scanner;

/**
 * @功能 类的有参 上机练习4
 * @作者 饶思羚
 * @时间 2017.5.21
 * @地址 机房
 * */
public class Account {
	int lastMoney = 0;//存款初始为0
	Scanner input = new Scanner(System.in);
	//显示主页
	public void Mnue(){
		
		System.out.println("1.存款\t2.取款\t0.退出");
		System.out.println("请选择你需要办理的业务：");
		int type = input.nextInt();
		switch(type){
			case 0:
				System.exit(0);
				System.out.println("谢谢使用！");
				break;
			case 1:
				System.out.println("请输入存款金额：");
				int putIn = input.nextInt();
				this.addIn(putIn);
				break;
			case 2:
				System.out.println("请输入取款金额：");
				int putOut = input.nextInt();
				this.getOut(putOut);
				break;
			default:
				System.exit(0);
				System.out.println("谢谢使用！");
		}
	}
	//存款
	public void addIn(int money){
		lastMoney += money;
		System.out.println("存款成功！\n");
		this.show();
	}
	//取款
	public void getOut(int money){
		if(lastMoney < money){
			System.out.println("余额不足！");
			System.out.println();
			this.Mnue();
		}
		else{
			lastMoney -= money;
			System.out.println("取款成功");
			this.show();
		}
	}
	//显示余额
	public void show(){
		System.out.println("当前余额为：" + lastMoney +"\n");
		this.Mnue();
	}
}
