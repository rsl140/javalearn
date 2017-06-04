package com.homework.zonghe;

public class PZuoYe17 extends MZuoYe17{

	@Override
	public void max() {
		int num4 = a>b?a:b;
		int maxnum = num4>c?num4:c;
		System.out.println("最大："+maxnum);
	}

	@Override
	public void min() {
		int num4 = a>b?b:a;
		int minnum = num4>c?c:num4;
		System.out.println("最小："+minnum);
	}
	
	public static void main(String[] args) {
		MZuoYe17 test = new PZuoYe17();
		test.max();
		test.min();
	}
}
