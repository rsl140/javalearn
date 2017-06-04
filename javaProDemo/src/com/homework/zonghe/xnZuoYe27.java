package com.homework.zonghe;

public class xnZuoYe27 {
	public void sum(int num,int count){
		int number = 1;
		for(int i = 0;i<count;i++){
			number*=num;
		}
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		xnZuoYe27 test = new xnZuoYe27();
		test.sum(10, 3);
	}
}
