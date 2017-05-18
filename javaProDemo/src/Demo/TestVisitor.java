package Demo;

import java.util.Scanner;

public class TestVisitor {
	
	/*
	 * @功能：课堂演示
	 * @作者：饶思羚
	 * @时间：2017.5.17
	 * @地点：机房
	 */
	public static void main(String[] args){
		Visitor visitor1 = new Visitor();
		Scanner input = new Scanner(System.in);
		System.out.println("输入游客姓名：");
		String inputName = input.next();
		visitor1.name = inputName;
		System.out.println("输入游客年龄：");
		int inputAge = input.nextInt();
		visitor1.age = inputAge;
		visitor1.showTicketInfo();
	}
}
