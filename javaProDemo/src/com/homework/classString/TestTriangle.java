package com.homework.classString;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		System.out.println("请输入3条边的值：a,b,c");
		Scanner input = new Scanner(System.in);
		String bian = input.next();
		String[] s = bian.split(",");
		Triangle t = new Triangle();
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		boolean istriangle = t.isTriangle(a, b, c);
		if(istriangle){
			System.out.println(t.shape(a, b, c));
		}
	}

}
