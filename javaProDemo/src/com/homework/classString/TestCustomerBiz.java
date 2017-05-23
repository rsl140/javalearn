package com.homework.classString;

import java.util.Scanner;

/**
 * @功能 类的有参 上机练习1
 * @作者 饶思羚
 * @时间 2017.5.19
 * @地址 机房
 * */
public class TestCustomerBiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag;//判断是否循环
		CustomerBiz cus = new CustomerBiz();
		do{
			flag = false;
			System.out.print("请输入客户的姓名：");
			String inputName = input.next();
			cus.addName(inputName);
			System.out.println("继续输入吗？(y/n)");
			String inputYesOrNo = input.next();
			if(inputYesOrNo.equals("y")){
				flag = true;
			}
			
		}while(flag);
		System.out.println("***************************");
		System.out.println("\t客户姓名列表\t");
		System.out.println("***************************");
		cus.showNames();//显示列表
		System.out.println();
		System.out.println();
		System.out.println("请输入要查找的客户姓名：");
		//查找是否存在
		String search = input.next();
		boolean isFind =cus.search(search);
		System.out.println("*****查找结果****");
		if(isFind){
			System.out.println("找到了！");
		}else{
			System.out.println("你确定你输入正确了吗？");
		}
	}

}
