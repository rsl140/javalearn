package com.homework.classNoString;
/**
 * @功能 类的无参 上机练习3
 * @作者 饶思羚
 * @时间 2017.5.18
 * @地址 机房
 * */

import java.util.Scanner;

public class StartSMS {
	Scanner input = new Scanner(System.in);
	public void Login(){
		System.out.println("请输入用户名：");
		String name = input.next();
		System.out.println("请输入密码：");
		String pwd = input.next();
		Menu m = new Menu();
		if(name.equals("123") && pwd.equals("123")){
			System.out.println("登陆成功！");
			m.showMainMenu();
		}else{
			System.out.println("您没有权限进入，请重新登陆！");
			m.showLoginMenu();
		}
	}
}
