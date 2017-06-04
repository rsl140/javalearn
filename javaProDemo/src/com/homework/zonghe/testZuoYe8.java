package com.homework.zonghe;

public class testZuoYe8 {
	public static void main(String[] args) {
		changFangTiZuoYe8 test = new changFangTi2ZuoYe8(4,5);
		changFangTi2ZuoYe8 test1 = (changFangTi2ZuoYe8)test;
		test1.tiji();
		System.out.println("体积为：" + test1.getGao());
	}
}
