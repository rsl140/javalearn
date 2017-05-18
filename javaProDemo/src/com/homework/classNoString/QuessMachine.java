package com.homework.classNoString;

import java.util.Scanner;

public class QuessMachine {
	/**
	 * @功能 类的无参 课后作业3
	 * @作者 饶思羚
	 * @时间 2017.5.18
	 * @地址 机房
	 * */
	public int initial(){
		System.out.println("请猜测“公主电动车”的价格：");
		int money = (int)(Math.random()*1000);
		return money;
	}
	
	public void guess(){
		int guessNum = initial();
		Scanner input = new Scanner(System.in);
		int count = 0;//定义输入了几次
		boolean flag = true;//判断是否循环
		do{
			int gus = input.nextInt();
			if(count>2){//超过4次跳出循环
				flag = false;
				System.out.println("4次内没有猜对下次努力吧！价格是：" + guessNum);
			}
			else if(count == 0){//第一次输出
				
				if(gus < guessNum){
					System.out.println("再大点");
				}
				else if(gus > guessNum){
					System.out.println("再小点");
				}
				else{
					System.out.println("猜对啦！");
				}
				System.out.println("再猜一次:");
				count++;
			}else{
				System.out.println("再猜一次:");
				
				if(gus < guessNum){
					System.out.println("再大点");
				}
				else if(gus > guessNum){
					System.out.println("再小点");
				}
				else{
					System.out.println("猜对啦！");
				}
				count++;
			}
		}while(flag);
		
	}
	
	
	
	
	public static void main(String[] args) {
		QuessMachine a = new QuessMachine();
		a.guess();
		

	}

}
