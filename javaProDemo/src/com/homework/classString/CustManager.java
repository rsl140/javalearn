package com.homework.classString;
/**
 * @功能 类的有参 上机练习5，6
 * @作者 饶思羚
 * @时间 2017.5.21
 * @地址 机房
 * */

import java.util.Scanner;

public class CustManager {
	Customer [] customers = new Customer[100];
	Scanner input = new Scanner(System.in);
	//显示主页
	public void Mnue(){
		
		boolean flag;
		do{
			flag = false;
			System.out.println("输入会员编号：");
			int id = input.nextInt();
			System.out.println("输入会员积分：");
			int jf = input.nextInt();
			this.addVip(id,jf);
			
			System.out.println("是否继续？(y/n)：");
			String go = input.next();
			
			if(go.equals("y")){
				flag = true;
			}
			
		}while(flag);
		this.show();
		System.out.println("输入要查找的会员编号：");
		int custNo = input.nextInt();
		int vipport = this.searchScore(custNo);
		System.out.println("该会员的积分为："+ vipport);
	}
	/*会员增加*/
	public void addVip(int id,int jf){
		for(int i = 0;i < customers.length;i++){
			if(null == customers[i]){
				//实例化新对象
//				customers[i].number = id;
//				customers[i].vipintegral = jf;
				customers[i] = new Customer(id,jf);
				break;
			}
		}
	}
	/*会员积分查找*/
	public int searchScore(int custNo){
		
		int vipport = -1;
		for(int i = 0;i < customers.length;i++){
			if(custNo == customers[i].number){
				vipport = customers[i].vipintegral;
				break;
			}
		}
		return vipport;
	}
	/*会员显示*/
	public void show(){
		System.out.println("******会员列表*****");
		System.out.println("编号" + "\t" + "积分");
		for(int i = 0;i < customers.length;i++){
			if(null != customers[i]){
				System.out.println(customers[i].number + "\t" + customers[i].vipintegral);
			}
		}
	}
}
