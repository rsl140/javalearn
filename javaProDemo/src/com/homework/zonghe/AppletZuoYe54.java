package com.homework.zonghe;

public class AppletZuoYe54 implements AZuoYe54{

	@Override
	public int method1(int x) {
		int num =1;
		for(int i=0;i<x;i++){
			num*=5;
		}
		return num;
	}

	@Override
	public int method2(int x, int y) {
		int num = x > y ? x:y;
		return num;
	}
	
	public void paint(){
		System.out.println(this.method1(2));
		System.out.println(this.method2(2,8));
	}
	public static void main(String[] args) {
		AppletZuoYe54 test = new AppletZuoYe54();
		test.paint();
	}
}
