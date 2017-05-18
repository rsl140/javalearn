package com.homework.classes;

import java.util.Scanner;

/**
 * @作者：饶思羚
 * @功能：面向对象一-上机练习三
 * @地址：机房
 * @时间：2017.5.17
 * */
public class ChangePassword {
	
	/**
	 * 更改管理员密码
	 * */
	public static void main(String[] args) {
		String nameInput;//保存用户输入的用户名
		String pwd;//保存用户输入的密码
		String pwdConfirm;//保存用户再次输入的密码
		Scanner input = new Scanner(System.in);
		
		Administrator admin = new Administrator();
		admin.name = "admin1";//给name属性赋值
		admin.password = "11111";//给password属性赋值
		//输入旧的用户名和密码
		System.out.println("请输入用户名：");
		nameInput =input.next();
		System.out.println("请输入密码：");
		pwd =input.next();
		//判断用户输入的是否正确
		if(admin.name.equals(nameInput) && admin.password.equals(pwd)){
			System.out.println("\n请输入新密码：");
			pwd =input.next();
			System.out.println("请再次输入新密码：");
			pwdConfirm =input.next();
			while(!pwd.equals(pwdConfirm)){
				System.out.println("两次输入不一致，请重新输入");
				System.out.println("\n请输入新密码：");
				pwd =input.next();
				System.out.println("请再次输入新密码：");
				pwdConfirm =input.next();
			}
			System.out.println("修改密码成功，您的新密码为：" + pwd);
		}else{
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
		}
	}

}
