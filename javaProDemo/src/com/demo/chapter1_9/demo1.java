package com.demo.chapter1_9;

/*
 * @功能：显示商品名称
 * @作者：饶思羚
 * @时间：2017.5.8
 * @地点：家
 */

public class demo1 {

	public static void main(String[] args) {
		String[] items = new String[] {"背包","鞋子","运动衫","外套","腰包"};
		System.out.println("本次特价产品有：");
		for(int i = 0;i<items.length;i++){
			System.out.println(items[i]);
		}
	}

}
