package com.homework.zonghe;

import java.util.Scanner;

public class TriangleZuoYe1 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入三角形的三个边以“,”号间隔");
			String str = input.next();
			String [] str1 = str.split(",");
			TriangleZuoYe1 triangle = new TriangleZuoYe1();
			boolean flag = triangle.isTriangle(Integer.parseInt(str1[0]),Integer.parseInt(str1[1]),Integer.parseInt(str1[2]));
			if(flag){
				triangle.shape(Integer.parseInt(str1[0]),Integer.parseInt(str1[1]),Integer.parseInt(str1[2]));
				System.out.println("面积为：" + (Integer.parseInt(str1[0])+Integer.parseInt(str1[1])+Integer.parseInt(str1[2]))/2);
				
			}
		}
		
		/*判断是否为三角形*/
		public boolean isTriangle(int a, int b, int c){
			if(a + b > c){
				System.out.println("是三角形！");
				return true;
			}else{
				System.out.println("不是三角形！");
				return false;
			}
			
		}
		/*判断是什么三角形*/
		public void shape(int a, int b, int c){
			
			if(a * a + b * b == c * c){
				System.out.println("直角三角形");
			}else if(a * a + b * b < c * c){
				System.out.println("钝角三角形");
			}else{
				System.out.println("锐角三角形");
			}
		}
}
