package com.homework.zonghe;

public class TESTZuoYe59 {
	public static void main(String[] args) {
		USPZuoYe59 test1 = new USPZuoYe59("x",12,1);
		Ak47ZuoYe58 test2 = new Ak47ZuoYe58("y",30,2);
		test1.add();
		test2.add();
		for(int i = 0;i<10;i++){
			test1.fire();
			test2.fire();
		}
		System.out.println("usp:"+test1.getNum());
		System.out.println("Ak47:"+test2.getNum());
	}
}
