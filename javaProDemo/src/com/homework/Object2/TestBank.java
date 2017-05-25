package com.homework.Object2;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner input = new Scanner(System.in);
		//double money = input.nextDouble();
		boolean flag;
		do{
			flag = true;
			System.out.println("1.存款\t2.取款\t3.查询\t4任意键退出.\n请输入：");
			int num = input.nextInt();
			double amount = 0;
			switch(num){
				case 1:
					 System.out.println("输入存款金额：");
					 amount = input.nextDouble();
					 bank.putIn(amount);
					break;
				case 2:
					System.out.println("输入取款金额：");
					 amount = input.nextDouble();
					 if(!bank.getOut(amount)){
					 }
					break;
				case 3:
					bank.search();
					break;
					default:
						System.exit(0);
			}
			bank.search();
		}while(flag);
	}

}
