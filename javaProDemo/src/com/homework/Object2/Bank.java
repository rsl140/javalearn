package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础3
 * @时间 2017.5.27
 * */
public class Bank {
	public int no;
	public String name = "123";
	public String address;
	public double amount;//余额
	public double mixAmount = 100;//最小余额
	

	/*存款*/
	public void putIn(double amount){
		System.out.println("原有余额："+ this.amount);
		this.amount += amount;
		System.out.println("存款后余额为："+ amount);
	}
	/*取款*/
	public boolean getOut(double money){
		 
		if(mixAmount > (amount - money)){
			System.out.println("至少保留100元");
			return false;
		}else{
			return true;
		}
	}
	
	/*查询*/
	public void search(){
		System.out.println("账户名："+ name + "\t余额："+amount);
	}
}
