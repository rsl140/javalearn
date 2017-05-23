package com.homework.classString;

import java.util.Scanner;

public class TestPrint {

	public static void main(String[] args) {
		Print p = new Print();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入行高：");
		int inputLine = input.nextInt();
		System.out.println("请输入要打印的字符：");
		String inputCh = input.next();
		p.printTriangle(inputLine, inputCh);

	}

}
