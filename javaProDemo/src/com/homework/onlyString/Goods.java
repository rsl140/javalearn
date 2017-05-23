package com.homework.onlyString;
/**
 * @功能 上机练习4
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 家
 * */

import java.util.Scanner;

public class Goods {
	Scanner input = new Scanner(System.in);
	String[] goods = new String[]{"电风扇", "洗衣机", "电视机", "冰箱", "空调机"};
	double[] price = new double[]{124.23, 4500, 8800.90, 5000.88, 4456};
	/*登陆*/
	public boolean login(){
		boolean flag = false;
		System.out.println("请输入用户名：");
		String name = input.next();
		System.out.println("请输入密码：");
		String pwd = input.next();
		if(name.equals("123") && pwd.equals("123")){
			flag = true;
		}
		return flag;
	}
	/*显示列表*/
	public void show(){
		System.out.println("————————欢迎进入商品批发城————————");
		System.out.println("编号\t商品\t\t价格");
		
		for(int i = 0;i < goods.length;i++){
			System.out.println(i + 1 +"\t" + goods[i] + "\t\t" + price[i]);
		}
		System.out.println("————————————————————————————————");
	}
	//输出总价格
	public double money(int num,int all){
		double allMoney = 0;
		allMoney = price[num - 1] * all;
		return allMoney;
	}
	/*格式化输出*/
	public StringBuffer chage(double d){
		StringBuffer str = new StringBuffer(String.valueOf(d));
		for(int i = str.indexOf(".") - 3; i > 0; i = i - 3){
			str.insert(i, ',');
		}
		return str;
	}

	
}
