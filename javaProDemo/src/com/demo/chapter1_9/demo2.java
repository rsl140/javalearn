package com.demo.chapter1_9;

/*
 * @功能：基本数据类型
 * @作者：饶思羚
 * @时间：2017.5.8
 * @地点：家
 */

public class demo2 {

	public static void main(String[] args) {
		int heightZhang = 170;
		int heightLi = heightZhang;
		System.out.println("张浩的身高："+heightZhang);
		System.out.println("李明的身高："+heightLi);
		System.out.println();
		
		heightLi = 180;
		
		System.out.println("张浩的身高："+heightZhang);
		System.out.println("李明的身高："+heightLi);
		System.out.println();
		
		
		
		/*
		 * 引用数据类型
		 */
		
		int[] zhang = new int[] {170,70};
		int[] li = zhang;
		System.out.println("张浩的身高："+zhang[0]);
		System.out.println("张浩的体重："+zhang[1]);
		System.out.println("李明的身高："+li[0]);
		System.out.println("李明的体重："+li[1]);
		System.out.println();
		
		li[0] = 180;
		li[1] = 80;
		System.out.println("张浩的身高："+zhang[0]);
		System.out.println("张浩的体重："+zhang[1]);
		System.out.println("李明的身高："+li[0]);
		System.out.println("李明的体重："+li[1]);
	}

}
