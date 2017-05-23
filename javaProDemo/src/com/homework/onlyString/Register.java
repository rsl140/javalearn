package com.homework.onlyString;

import java.util.Scanner;

public class Register {
	/**
	 * @功能 上机练习1
	 * @作者 饶思羚
	 * @时间 2017.5.23
	 * @地址 机房
	 * */
	public static void main(String[] args) {
		System.out.println("********欢迎进入注册系统*********");
		String uname,pwd1,pwd2;
		boolean flag;
		do{
			flag = false;
			System.out.println("请输入用户名：");
			Scanner input = new Scanner(System.in);
			uname = input.next();
			System.out.println("请输入密码：");
			pwd1 = input.next();
			System.out.println("请再次输入密码：");
			pwd2 = input.next();
			Register demo = new Register();
			String reust = demo.verify(pwd1, pwd2, uname);
			if(reust.equals("注册成功.")){
				System.out.println(reust);
			}else{
				System.out.println(reust);
				flag = true;
			}
			
		}while(flag);
		
	}
	
	public static String verify(String pwd1,String pwd2,String uname){
		String msg;
		if(uname.length() < 3){
			msg = "用户名不小于3位。";
		}
		else if(pwd1.length() < 6){
			msg = "密码至少需要6位！";
		}
		else if(!pwd1.equals(pwd2)){
			msg = "两次密码输入不一致";
		}
		else{
			msg = "注册成功.";
		}
		
		return msg;
	}

}
