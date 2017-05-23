package com.homework.onlyString;

import java.util.Scanner;

public class RegisterUp {
	/**
	 * @功能 上机练习2
	 * @作者 饶思羚
	 * @时间 2017.5.23
	 * @地址 机房
	 * */
	public static void main(String[] args) {
		System.out.println("********欢迎进入注册系统*********");
		String idCard,mobilPhone,phone;
		boolean flag;
		do{
			flag = false;
			System.out.println("请输入身份证：");
			Scanner input = new Scanner(System.in);
			idCard = input.next();
			System.out.println("请输入手机号：");
			mobilPhone = input.next();
			System.out.println("请输入座机号：");
			phone = input.next();
			RegisterUp demo = new RegisterUp();
			boolean reust = demo.verify(idCard, mobilPhone, phone);
			if(reust){
				System.out.println("注册成功！");
			}
			else{
				flag =true;
			}
			
		}while(flag);
		
	}
	
	public static boolean verify(String idCard,String mobilPhone,String phone){
		boolean msg = false;
		String[] phones = phone.split("-");
		boolean id = (idCard.length() == 16 || idCard.length() == 18);
		if(!id){
			System.out.println("身份证位号必须为18位或16位！");
			
		}else if(mobilPhone.length() != 11){
			System.out.println("手机号必须为11位！");
		}else if(phones[0].length() !=4 || phones[1].length() !=7){
			System.out.println("座机号码必须为4位，电话号码必须为7位");
		}else{
			msg = true;
		}
		return msg;
	}

}
