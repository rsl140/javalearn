package com.homework.classNoString;

import java.util.Scanner;

/**
 * @功能 类的无参 上机练习2
 * @作者 饶思羚
 * @时间 2017.5.18
 * @地址 机房
 * */
public class Menu {
	/*登陆*/
	public void showLoginMenu(){
		System.out.println("\n\t欢迎使用我型我素购物管理系统\n");
		System.out.println("\t\t 1.登 陆 系 统\n");
		System.out.println("\t\t 2.退 出\n");
		System.out.println("**********************************");
		System.out.println("请选择，输入数字：");
		Scanner input = new Scanner(System.in);
		boolean con;
		StartSMS login = new StartSMS();
		
		do{
			con = false;
			int no = input.nextInt();
			switch(no){
				case 1:
					login.Login();
					break;
				case 2:
					System.exit(0);
					break;
				default:
						System.out.println("输入有误，请重新输入。");
						con = true;
			}
		}while(con);
	}
	/*显示主菜单*/
	public void showMainMenu(){
		System.out.println("\n\t我型我素购物管理系统主菜单\n");
		System.out.println("**********************************");
		System.out.println("\t\t 1.客 户 信 息 管 理\n");
		System.out.println("\t\t 2.真 情 回 馈\n");
		System.out.println("**********************************");
		System.out.println("请选择，输入数或按0返回上一级菜单：");
		
		boolean con;
		do{
			con = false;
		
			Scanner input = new Scanner(System.in);
			int no = input.nextInt();
			switch(no){
				case 1 :
					showCustMenu();
					break;
				case 2 :
					showSendGMenu();
					break;
				case 0 :
					showLoginMenu();
					break;
				default :
					System.out.println("输入有误，请重新输入数字：");
					con = true;
			}
		}while(con);
	}
	
	/*显示客户信息管理菜单*/
	public void showCustMenu(){
		System.out.println("\n\t客户信息管理\n");
		System.out.println("**********************************");
		System.out.println("\t\t 1.查询客户信息\n");
		System.out.println("\t\t 2.修改客户信息\n");
		System.out.println("\t\t 3.添加客户信息\n");
		System.out.println("\t\t 4.显示所有客户信息\n");
		System.out.println("**********************************");
		System.out.println("请选择，输入数或按0返回上一级菜单：");
		boolean con;
		do{
			con = false;
		
			Scanner input = new Scanner(System.in);
			int no = input.nextInt();
			switch(no){
				case 1 :
					System.out.println("查询客户信息");
					break;
				case 2 :
					System.out.println("查询客户信息");
					break;
				case 3 :
					System.out.println("查询客户信息");
					break;
				case 4 :
					System.out.println("查询客户信息");
					break;
				case 0 :
					showMainMenu();
					break;
				default :
					System.out.println("输入有误，请重新输入数字：");
					con = true;
			}
		}while(con);
		showMainMenu();
	}
	/*显示真情回馈管理菜单*/
	public void showSendGMenu(){
		System.out.println("\n\t真情回馈\n");
		System.out.println("**********************************");
		System.out.println("\t\t 1.幸运大放送\n");
		System.out.println("\t\t 2.幸运抽奖\n");
		System.out.println("\t\t 3.生日问候\n");
		System.out.println("**********************************");
		System.out.println("请选择，输入数或按0返回上一级菜单：");
		boolean con;
		do{
			con = false;
		
			Scanner input = new Scanner(System.in);
			int no = input.nextInt();
			switch(no){
				case 1 :
					System.out.println("幸运大放送");
					break;
				case 2 :
					System.out.println("幸运抽奖");
					break;
				case 3 :
					System.out.println("生日问候");
					break;
				case 0 :
					showMainMenu();
					break;
				default :
					System.out.println("输入有误，请重新输入数字：");
					con = true;
			}
		}while(con);
		showMainMenu();
	}
}
