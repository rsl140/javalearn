package com.homework.onlyString;

import java.util.Scanner;

public class TestGoods {

	public static void main(String[] args) {
		Goods goods = new Goods();
		Scanner input = new Scanner(System.in);
		
		if(goods.login()){
			goods.show();
			System.out.println("请输入批发号：");
			int num = input.nextInt();
			System.out.println("请输入批发数量：");
			int all = input.nextInt();
			//获得总价
			double allMoney = goods.money(num, all);
			System.out.println("您需付款：" + goods.chage(allMoney));
			
		}else{
			System.out.println("登陆失败！");
		}
	}

}
